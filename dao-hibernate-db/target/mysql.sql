create table ODE_SCHEMA_VERSION(VERSION integer);
insert into ODE_SCHEMA_VERSION values (6);
-- Apache ODE - SimpleScheduler Database Schema
--
-- MySQL scripts by Maciej Szefler.
--
--
DROP TABLE IF EXISTS ODE_JOB;

CREATE TABLE ODE_JOB (
  jobid CHAR(64)  NOT NULL DEFAULT '',
  ts BIGINT  NOT NULL DEFAULT 0,
  nodeid char(64)  NULL,
  scheduled int  NOT NULL DEFAULT 0,
  transacted int  NOT NULL DEFAULT 0,

  instanceId BIGINT,
  mexId varchar(255),
  processId varchar(255),
  type varchar(255),
  channel varchar(255),
  correlatorId varchar(255),
  correlationKeySet varchar(255),
  retryCount int,
  inMem int,
  detailsExt blob(4096),

  PRIMARY KEY(jobid),
  INDEX IDX_ODE_JOB_TS(ts),
  INDEX IDX_ODE_JOB_NODEID(nodeid)
)
TYPE=InnoDB;

COMMIT;

create table BPEL_ACTIVITY_RECOVERY (ID bigint not null, PIID bigint, AID bigint, CHANNEL varchar(255), REASON varchar(255), DATE_TIME datetime, DETAILS blob(2G), ACTIONS varchar(255), RETRIES integer, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATION_PROP (ID bigint not null, NAME varchar(255), NAMESPACE varchar(255), VALUE varchar(255), CORR_SET_ID bigint, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATION_SET (ID bigint not null, VALUE varchar(255), CORR_SET_NAME varchar(255), SCOPE_ID bigint, PIID bigint, PROCESS_ID bigint, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATOR (ID bigint not null, CID varchar(255), PROCESS_ID bigint, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_CORRELATOR_MESSAGE_CKEY (ID bigint not null, CKEY varchar(255), CORRELATOR_MESSAGE_ID bigint, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_EVENT (ID bigint not null, IID bigint, PID bigint, TSTAMP datetime, TYPE varchar(255), DETAIL text, DATA blob(2G), SID bigint, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_FAULT (ID bigint not null, FAULTNAME varchar(255), DATA blob(2G), EXPLANATION varchar(4000), LINE_NUM integer, AID integer, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_INSTANCE (ID bigint not null, INSTANTIATING_CORRELATOR bigint, FAULT bigint, JACOB_STATE_DATA blob(2G), PREVIOUS_STATE smallint, PROCESS_ID bigint, STATE smallint, LAST_ACTIVE_DT datetime, SEQUENCE bigint, FAILURE_COUNT integer, FAILURE_DT datetime, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_MESSAGE (ID bigint not null, MEX bigint, TYPE varchar(255), MESSAGE_DATA blob(2G), MESSAGE_HEADER blob(2G), INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_MESSAGE_EXCHANGE (ID bigint not null, PORT_TYPE varchar(255), CHANNEL_NAME varchar(255), CLIENTKEY varchar(255), ENDPOINT blob(2G), CALLBACK_ENDPOINT blob(2G), REQUEST bigint, RESPONSE bigint, INSERT_DT datetime, OPERATION varchar(255), STATE varchar(255), PROCESS bigint, PIID bigint, DIR char(1), PLINK_MODELID integer, PATTERN varchar(255), CORR_STATUS varchar(255), FAULT_TYPE varchar(255), FAULT_EXPL varchar(255), CALLEE varchar(255), PARTNERLINK bigint, PIPED_ID varchar(255), SUBSCRIBER_COUNT integer, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_MEX_PROPS (MEX bigint not null, VALUE varchar(8000), NAME varchar(255) not null, primary key (MEX, NAME));
create table BPEL_PLINK_VAL (ID bigint not null, PARTNER_LINK varchar(100) not null, PARTNERROLE varchar(100), MYROLE_EPR_DATA blob(2G), PARTNERROLE_EPR_DATA blob(2G), PROCESS bigint, SCOPE bigint, SVCNAME varchar(255), MYROLE varchar(100), MODELID integer, MYSESSIONID varchar(255), PARTNERSESSIONID varchar(255), INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_PROCESS (ID bigint not null, PROCID varchar(255) not null unique, deployer varchar(255), deploydate datetime, type_name varchar(255), type_ns varchar(255), version bigint, ACTIVE_ bit, guid varchar(255), INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_SCOPE (ID bigint not null, PIID bigint, PARENT_SCOPE_ID bigint, STATE varchar(255) not null, NAME varchar(255) not null, MODELID integer, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_SELECTORS (ID bigint not null, PIID bigint not null, SELGRPID varchar(255) not null, IDX integer not null, CORRELATION_KEY varchar(255) not null, PROC_TYPE varchar(255) not null, ROUTE_POLICY varchar(255), CORRELATOR bigint not null, INSERT_TIME datetime, MLOCK integer not null, primary key (ID), unique (CORRELATION_KEY, CORRELATOR));
create table BPEL_UNMATCHED (ID bigint not null, MEX bigint, CORRELATION_KEY varchar(255), CORRELATOR bigint not null, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table BPEL_XML_DATA (ID bigint not null, DATA blob(2G), NAME varchar(255) not null, SIMPLE_VALUE varchar(255), SCOPE_ID bigint, PIID bigint, IS_SIMPLE_TYPE bit, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table STORE_DU (NAME varchar(255) not null, deployer varchar(255), DEPLOYDT datetime, DIR varchar(255), primary key (NAME));
create table STORE_PROCESS (PID varchar(255) not null, DU varchar(255), TYPE varchar(255), version bigint, STATE varchar(255), primary key (PID));
create table STORE_PROCESS_PROP (propId varchar(255) not null, value varchar(2048), name varchar(255) not null, primary key (propId, name));
create table STORE_VERSIONS (ID integer not null, VERSION bigint, primary key (ID));
create table TASK_ATTACHMENT (ID bigint not null, ATTACHMENT_ID bigint, MESSAGE_EXCHANGE_ID bigint, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create table VAR_PROPERTY (ID bigint not null, XML_DATA_ID bigint, PROP_VALUE varchar(255), PROP_NAME varchar(255) not null, INSERT_TIME datetime, MLOCK integer not null, primary key (ID));
create index IDX_CORRELATOR_CID on BPEL_CORRELATOR (CID);
create index IDX_BPEL_CORRELATOR_MESSAGE_CKEY on BPEL_CORRELATOR_MESSAGE_CKEY (CKEY);
create index IDX_SELECTOR_SELGRPID on BPEL_SELECTORS (SELGRPID);
create index IDX_SELECTOR_CKEY on BPEL_SELECTORS (CORRELATION_KEY);
create index IDX_SELECTOR_CORRELATOR on BPEL_SELECTORS (CORRELATOR);
create index IDX_UNMATCHED_CORRELATOR on BPEL_UNMATCHED (CORRELATOR);
create index IDX_UNMATCHED_CKEY on BPEL_UNMATCHED (CORRELATION_KEY);
create table hibernate_unique_key ( next_hi integer );
insert into hibernate_unique_key values ( 0 );
