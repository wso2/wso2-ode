package org.apache.ode.extension.longrunning;

import org.apache.ode.bpel.runtime.extension.AbstractExtensionCorreationFilter;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.NamedNodeMap;

import javax.xml.namespace.QName;
import java.util.Iterator;

public class CorrelationFilter extends AbstractExtensionCorreationFilter {
    private static Log log = LogFactory.getLog(CorrelationFilter.class);
    public static final String FEEDBACK_HEADER_LOCALNAME = "feedback";
    public static final String FEEDBACK_HEADER_ROLE_URI = "http://schemas.xmlsoap.org/soap/envelope/actor/feedback";
    public static final String FEEDBACK_ATTRIBUTE_NAMESPACE = "http://wso2.org/humantask/feedback";
    public static final String FEEDBACK_ATTRIBUTE_NAME = "taskid";

    /**
     * Get namespace of the filter
     *
     * @return Namespace of the filter
     */
    public String getNamespaceURI() {
        return "http://wso2.org";
    }

    /**
     * Register correlation filter with a name
     */
    public void registerExtensionCorrelationFilter() {
        registerFilter("sampleFilter", CorrelationFilter.class);
    }

    /**
     * Compute correlation values
     *
     * @param body   Soap body
     * @param header Soap header
     * @return Correlation values
     */
    public String[] computeCorrelationValues(Element body, Element header) {

        String id = getTaskID(header);
        if (id == null) {
            //
            id = getTaskID(body);
        }

        if (id == null) {
            log.error("null id");
        } else {
            log.info("ID: " + id);
        }
        
        return new String[]{id};
    }

    private String getTaskID(Element envelope) {
        /*
        * <soapenv:Header>
        * <axis2ns1:feedback xmlns:axis2ns1="http://wso2.org/humantask/feedback"
        * soapenv:actor="http://schemas.xmlsoap.org/soap/envelope/actor/feedback" axis2ns1:taskid="500" />
        * </soapenv:Header>
        * */
        String taskID = null;
        NodeList nList = envelope.getElementsByTagNameNS(FEEDBACK_ATTRIBUTE_NAMESPACE, FEEDBACK_HEADER_LOCALNAME);
        if (nList.getLength() > 0) {
            Node nNode = nList.item(0);
            NamedNodeMap namedNodeMap = nNode.getAttributes();
            if (namedNodeMap.getLength() > 0) {
                Node attr = namedNodeMap.getNamedItemNS(FEEDBACK_ATTRIBUTE_NAMESPACE, FEEDBACK_ATTRIBUTE_NAME);
                taskID = attr.getTextContent();
            }
        }
        //String id = envelope.getAttributeNS(FEEDBACK_ATTRIBUTE_NAMESPACE, FEEDBACK_ATTRIBUTE_NAME);

        if (taskID == null || taskID.equals("")) {
            NodeList nodeList = envelope.getElementsByTagNameNS("http://www.insurance.example.com/claims/schema", "response");
            if (nodeList.getLength() == 1) {
                Node ele = nodeList.item(0);
                taskID = ele.getTextContent();
            } else {
                log.error("elements are > or < 1");
            }
        }
//        NodeList nodeList = envelope.getElementsByTagNameNS(FEEDBACK_ATTRIBUTE_NAMESPACE, FEEDBACK_HEADER_LOCALNAME);
//
//        if (nodeList.getLength() == 1) {
//
//        } else {
//            log.error("headers are > or < 1");
//            return null;
//        }
//
//        Node header = nodeList.item(0);
//
//
//            if (soapHeaderBlock.getLocalName().equals(Constants.FEEDBACK_HEADER_LOCALNAME)) {
//                taskID = soapHeaderBlock.getAttributeValue(new QName(Constants.FEEDBACK_ATTRIBUTE_NAMESPACE,
//                        Constants.FEEDBACK_ATTRIBUTE_NAME));
//                break;
//            }

        return taskID;
    }

    /**
     * Get the name of the filter
     *
     * @return Name
     */
    public String getName() {
        return "sampleFilter";  
    }
}
