package org.apache.ode.extension.longrunning;

import com.ibm.wsdl.extensions.soap.SOAPAddressImpl;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.llom.util.AXIOMUtil;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ode.bpel.common.FaultException;
import org.apache.ode.bpel.dd.DeployDocument;
import org.apache.ode.bpel.dd.TDeployment;
import org.apache.ode.bpel.dd.TInvoke;
import org.apache.ode.bpel.dd.TProvide;
import org.apache.ode.bpel.o.OProcess;
import org.apache.ode.bpel.runtime.PartnerLinkInstance;
import org.apache.ode.bpel.runtime.extension.AbstractLongRunningExtensionOperation;
import org.apache.ode.bpel.runtime.extension.ExtensionContext;
import org.apache.ode.store.DeploymentUnitDir;
import org.apache.ode.utils.DOMUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.wsdl.Definition;
import javax.wsdl.Port;
import javax.wsdl.Service;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public class LongRunningExtensionOperation extends AbstractLongRunningExtensionOperation {

    private static Log log = LogFactory.getLog(AbstractLongRunningExtensionOperation.class);

    private ExtensionContext extensionContext;
    private String[] correlationValues;
    private String cid;
    LongRunningActivity longRunningActivity;

    // private static final long serialVersionUID = -823722741332011L;

    /**
     * Initial stuff and calling an external service which causes to send back a response in an indefinite time.
     * Corelation values should be set within this method.
     *
     * @param context ExtensionContext
     * @param cid     cid
     * @param element ExtensionActivity
     */
    public void runAsync(ExtensionContext context, String cid, Element element)
            throws FaultException {
        extensionContext = context;
        this.cid = cid;

        longRunningActivity = new LongRunningActivity(element);
        OMElement payload;

        ServiceClient sender = null;
        String corId = null;
        try {
            Element inputEle = (Element) context.readVariable(longRunningActivity.getInputVariable());
            Node inputNode = inputEle.getFirstChild().getFirstChild();

            String inputStr = DOMUtils.domToString(inputNode);
            payload = AXIOMUtil.stringToOM(inputStr);
//            OMElement tempPayload = AXIOMUtil.stringToOM(inputStr);
//            payload = tempPayload.getOMFactory().createOMElement(longRunningActivity.getOperation(),
//                    tempPayload.getNamespace().getNamespaceURI(),
//                    null);
//            payload.addChild(tempPayload);
            EndpointReference targetEPR = new EndpointReference(longRunningActivity.getServiceEPR());
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:approve");    //TODO
            sender = null;

            sender = new ServiceClient();
            sender.setOptions(options);
            OMElement response = sender.sendReceive(payload);
            corId = getCorrelationValue(response);
            if (corId == null) {
                log.error("Correlation value is null");
                throw new FaultException(new QName(LongRunningExtensionBundle.NS, "Correlation value is null"));
            }
        } catch (Exception e) {
            throw new FaultException(new QName(LongRunningExtensionBundle.NS, "LongRunningExtension"), e);
        } finally {
            if (sender != null) {
                try {
                    //To release http connections to connection pool
                    sender.cleanupTransport();
                } catch (AxisFault axisFault) {
                    axisFault.printStackTrace();
                    log.warn("Unable to release http connections");
//                    context.completeWithFault(cid, axisFault);
                }
            }
        }

        correlationValues = new String[]{corId};
        context.setCorrelationValues(correlationValues);
        String correlatorId = genCorrelatorId();
        if (correlatorId == null) {
            throw new FaultException(new QName(LongRunningExtensionBundle.NS, "Null correlatorId"));
        }

        context.setCorrelatorId(correlatorId);

//        String soapBody = "<ClaimApprovalData xmlns=\"http://www.insurance.example.com/claims/schema\">\n" +
//                "\t\t\t\t\t\t<test5:cust xmlns:test5=\"http://www.insurance.example.com/claims/schema\">\n" +
//                "\t\t\t\t\t\t    <test5:id>uui World</test5:id>\n" +
//                "\t\t\t\t\t\t    <test5:firstname>FNAME</test5:firstname>\n" +
//                "\t\t\t\t\t\t    <test5:lastname>LNAME</test5:lastname>\n" +
//                "\t\t\t\t\t\t</test5:cust>\n" +
//                "\t\t\t\t\t\t<test5:amount xmlns:test5=\"http://www.insurance.example.com/claims/schema\">1000</test5:amount>\n" +
//                "\t\t\t\t\t\t<test5:region xmlns:test5=\"http://www.insurance.example.com/claims/schema\">Colombo</test5:region>\n" +
//                "\t\t\t\t\t\t<test5:priority xmlns:test5=\"http://www.insurance.example.com/claims/schema\">3</test5:priority>\n" +
//                "\t\t\t\t\t\t<test5:activateAt xmlns:test5=\"http://www.insurance.example.com/claims/schema\">2001-10-26T21:32:52</test5:activateAt>\n" +
//                "\t\t\t\t\t</ClaimApprovalData>";


//        try {
//            payload = AXIOMUtil.stringToOM(soapBody);
//        } catch (XMLStreamException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//            context.completeWithFault(cid, new Exception("payload error"));
//            return;
//        }

        //EndpointReference targetEPR = new EndpointReference("http://localhost:9763/services/ClaimService");

        //options.setProperty(HTTPConstants.AUTO_RELEASE_CONNECTION, "true");


    }

    private String getCorrelationValue(OMElement response) {
        if (!response.getQName().equals(new QName(null, "part")))
            return null;
        OMElement hifb = response.getFirstChildWithName(new QName("http://wso2.org/humantask/feedback", "HIFeedback"));
        if (hifb == null) {
            return null;
        }
        OMElement taskIDele = hifb.getFirstChildWithName(new QName("http://wso2.org/humantask/feedback", "TaskID"));
        if (taskIDele == null) {
            return null;
        }
        return taskIDele.getText();
    }

    private String genCorrelatorId() throws FaultException {
        PartnerLinkInstance plink;
        String operation = longRunningActivity.getResponseOperation();
        plink = extensionContext.getPartnerLinkInstance(longRunningActivity.getPartnerLink());
        return plink.partnerLink.getName() + "." + operation;
    }

    /**
     * Called when the response for the above service received
     *
     * @param mexId MessageExchange id
     */
    public void onRequestReceived(String mexId) throws FaultException {
        _log.info("Response received");
        //((ExtensionContextImpl)extensionContext).setBpelRuntimeContext(context);
        Element notificationMessageEle = extensionContext.getInternalInstance().getMyRequest(mexId);
        Node part = extensionContext.getPartData(notificationMessageEle, longRunningActivity.getOutputVariable());
        _log.info("RESPONSE: " + DOMUtils.domToString(notificationMessageEle));
        _log.info("PART: " + DOMUtils.domToString(part));
        extensionContext.writeVariable(longRunningActivity.getOutputVariable(), part);

        extensionContext.complete(cid);
    }


    private class LongRunningActivity implements Serializable {
        private static final long serialVersionUID = -82336987878838011L;

        private Element content;
        private DeploymentUnitDir du;
        private QName serviceName;
        private String servicePort;
        private QName callbackServiceName;
        private String callbackServicePort;
        private String serviceURI;

        LongRunningActivity(Element content) {
            this.content = content;
            du = new DeploymentUnitDir(new File(extensionContext.getDUDir()));
        }

        public String getName() {
            return content.getAttribute("name");
        }

        public String getInputVariable() {
            return content.getAttribute("inputVariable");
        }

        public String getOutputVariable() {
            return content.getAttribute("outputVariable");
        }

        public String getPartnerLink() {
            return content.getAttribute("partnerLink");
        }

        public String getOperation() {
            return content.getAttribute("operation");
        }

        public String getResponseOperation() {
            return content.getAttribute("responseOperation");
        }

        public String getServiceEPR() throws FaultException {
            if (du == null) {
                du = new DeploymentUnitDir(new File(extensionContext.getDUDir()));
            }
            DeployDocument deployDocument = du.getDeploymentDescriptor();
            OProcess processModel = extensionContext.getProcessModel();
            TDeployment.Process myProcess = null;
            List<TDeployment.Process> processList = deployDocument.getDeploy().getProcessList();
            for (TDeployment.Process process : processList) {
                if (process.getName().equals(processModel.getQName())) {
                    myProcess = process;
                    break;
                }
            }

            if (myProcess == null) {
                throw new FaultException(new QName(LongRunningExtensionBundle.NS, "related process not found"));
            }

            List<TInvoke> tInvokeList = myProcess.getInvokeList();
            for (TInvoke tInvoke : tInvokeList) {
                if (tInvoke.getPartnerLink().equals(getPartnerLink())) {
                    serviceName = tInvoke.getService().getName();
                    servicePort = tInvoke.getService().getPort();
                    break;
                }
            }

            if (serviceName == null || servicePort == null) {
                log.error("service and port for human interaction is not found in the deploy.xml");
                throw new FaultException(new QName(LongRunningExtensionBundle.NS,
                        "service and port for human interaction is not found in the deploy.xml"));
            }

            //get the callback information
            List<TProvide> tProvideList = myProcess.getProvideList();
            for (TProvide tProvide : tProvideList) {
                if (tProvide.getPartnerLink().equals(getPartnerLink())) {
                    callbackServiceName = tProvide.getService().getName();
                    callbackServicePort = tProvide.getService().getPort();
                    break;
                }
            }
//            if (callbackServiceName == null || callbackServicePort == null) {
//                throw new FaultException(new QName(LongRunningExtensionBundle.NS,
//                        "service and port for human task callback is not found in the deploy.xml"));
//            }

            Definition serviceWSDL;
            serviceWSDL = du.getDefinitionForService(serviceName);

            Service service = serviceWSDL.getService(serviceName);
            Port port = service.getPort(servicePort);
            List extList = port.getExtensibilityElements();
            for (Object extEle : extList) {
                if (extEle instanceof SOAPAddressImpl) {
                    SOAPAddressImpl soapAddress = (SOAPAddressImpl) extEle;
                    serviceURI = soapAddress.getLocationURI();
                    break;
                }
            }

            if (serviceURI == null) {
                throw new FaultException(new QName(LongRunningExtensionBundle.NS, "Service URI is not available"));
            }

            return serviceURI;
        }
    }
}
