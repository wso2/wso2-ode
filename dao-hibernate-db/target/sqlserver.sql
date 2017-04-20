create table ODE_SCHEMA_VERSION(VERSION integer);
insert into ODE_SCHEMA_VERSION values (6);
-- Apache ODE - SimpleScheduler Database Schema
--
-- Apache Derby scripts by Maciej Szefler.
--
--

CREATE TABLE ode_job (
  jobid CHAR(64)  NOT NULL DEFAULT '',
  ts BIGINT  NOT NULL DEFAULT 0,
  nodeid char(64),
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

  PRIMARY KEY(jobid));

CREATE INDEX IDX_ODE_JOB_TS ON ode_job(ts);
CREATE INDEX IDX_ODE_JOB_NODEID ON ode_job(nodeid);


create table BPEL_ACTIVITY_RECOVERY (ID numeric(19,0) not null, PIID numeric(19,0) null, AID numeric(19,0) null, CHANNEL varchar(255) null, REASON varchar(255) null, DATE_TIME datetime null, DETAILS blob(2G) null, ACTIONS varchar(255) null, RETRIES int null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_CORRELATION_PROP (ID numeric(19,0) not null, NAME varchar(255) null, NAMESPACE varchar(255) null, VALUE varchar(255) null, CORR_SET_ID numeric(19,0) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_CORRELATION_SET (ID numeric(19,0) not null, VALUE varchar(255) null, CORR_SET_NAME varchar(255) null, SCOPE_ID numeric(19,0) null, PIID numeric(19,0) null, PROCESS_ID numeric(19,0) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_CORRELATOR (ID numeric(19,0) not null, CID varchar(255) null, PROCESS_ID numeric(19,0) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_CORRELATOR_MESSAGE_CKEY (ID numeric(19,0) not null, CKEY varchar(255) null, CORRELATOR_MESSAGE_ID numeric(19,0) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_EVENT (ID numeric(19,0) not null, IID numeric(19,0) null, PID numeric(19,0) null, TSTAMP datetime null, TYPE varchar(255) null, DETAIL text null, DATA blob(2G) null, SID numeric(19,0) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_FAULT (ID numeric(19,0) not null, FAULTNAME varchar(255) null, DATA blob(2G) null, EXPLANATION varchar(4000) null, LINE_NUM int null, AID int null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_INSTANCE (ID numeric(19,0) not null, INSTANTIATING_CORRELATOR numeric(19,0) null, FAULT numeric(19,0) null, JACOB_STATE_DATA blob(2G) null, PREVIOUS_STATE smallint null, PROCESS_ID numeric(19,0) null, STATE smallint null, LAST_ACTIVE_DT datetime null, SEQUENCE numeric(19,0) null, FAILURE_COUNT int null, FAILURE_DT datetime null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_MESSAGE (ID numeric(19,0) not null, MEX numeric(19,0) null, TYPE varchar(255) null, MESSAGE_DATA blob(2G) null, MESSAGE_HEADER blob(2G) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_MESSAGE_EXCHANGE (ID numeric(19,0) not null, PORT_TYPE varchar(255) null, CHANNEL_NAME varchar(255) null, CLIENTKEY varchar(255) null, ENDPOINT blob(2G) null, CALLBACK_ENDPOINT blob(2G) null, REQUEST numeric(19,0) null, RESPONSE numeric(19,0) null, INSERT_DT datetime null, OPERATION varchar(255) null, STATE varchar(255) null, PROCESS numeric(19,0) null, PIID numeric(19,0) null, DIR char(1) null, PLINK_MODELID int null, PATTERN varchar(255) null, CORR_STATUS varchar(255) null, FAULT_TYPE varchar(255) null, FAULT_EXPL varchar(255) null, CALLEE varchar(255) null, PARTNERLINK numeric(19,0) null, PIPED_ID varchar(255) null, SUBSCRIBER_COUNT int null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_MEX_PROPS (MEX numeric(19,0) not null, VALUE varchar(8000) null, NAME varchar(255) not null, primary key (MEX, NAME));
create table BPEL_PLINK_VAL (ID numeric(19,0) not null, PARTNER_LINK varchar(100) not null, PARTNERROLE varchar(100) null, MYROLE_EPR_DATA blob(2G) null, PARTNERROLE_EPR_DATA blob(2G) null, PROCESS numeric(19,0) null, SCOPE numeric(19,0) null, SVCNAME varchar(255) null, MYROLE varchar(100) null, MODELID int null, MYSESSIONID varchar(255) null, PARTNERSESSIONID varchar(255) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_PROCESS (ID numeric(19,0) not null, PROCID varchar(255) not null unique, deployer varchar(255) null, deploydate datetime null, type_name varchar(255) null, type_ns varchar(255) null, version numeric(19,0) null, ACTIVE_ tinyint null, guid varchar(255) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_SCOPE (ID numeric(19,0) not null, PIID numeric(19,0) null, PARENT_SCOPE_ID numeric(19,0) null, STATE varchar(255) not null, NAME varchar(255) not null, MODELID int null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_SELECTORS (ID numeric(19,0) not null, PIID numeric(19,0) not null, SELGRPID varchar(255) not null, IDX int not null, CORRELATION_KEY varchar(255) not null, PROC_TYPE varchar(255) not null, ROUTE_POLICY varchar(255) null, CORRELATOR numeric(19,0) not null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID), unique (CORRELATION_KEY, CORRELATOR));
create table BPEL_UNMATCHED (ID numeric(19,0) not null, MEX numeric(19,0) null, CORRELATION_KEY varchar(255) null, CORRELATOR numeric(19,0) not null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table BPEL_XML_DATA (ID numeric(19,0) not null, DATA blob(2G) null, NAME varchar(255) not null, SIMPLE_VALUE varchar(255) null, SCOPE_ID numeric(19,0) null, PIID numeric(19,0) null, IS_SIMPLE_TYPE tinyint null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table STORE_DU (NAME varchar(255) not null, deployer varchar(255) null, DEPLOYDT datetime null, DIR varchar(255) null, primary key (NAME));
create table STORE_PROCESS (PID varchar(255) not null, DU varchar(255) null, TYPE varchar(255) null, version numeric(19,0) null, STATE varchar(255) null, primary key (PID));
create table STORE_PROCESS_PROP (propId varchar(255) not null, value varchar(2048) null, name varchar(255) not null, primary key (propId, name));
create table STORE_VERSIONS (ID int not null, VERSION numeric(19,0) null, primary key (ID));
create table TASK_ATTACHMENT (ID numeric(19,0) not null, ATTACHMENT_ID numeric(19,0) null, MESSAGE_EXCHANGE_ID numeric(19,0) null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create table VAR_PROPERTY (ID numeric(19,0) not null, XML_DATA_ID numeric(19,0) null, PROP_VALUE varchar(255) null, PROP_NAME varchar(255) not null, INSERT_TIME datetime null, MLOCK int not null, primary key (ID));
create index IDX_CORRELATOR_CID on BPEL_CORRELATOR (CID);
create index IDX_BPEL_CORRELATOR_MESSAGE_CKEY on BPEL_CORRELATOR_MESSAGE_CKEY (CKEY);
create index IDX_SELECTOR_SELGRPID on BPEL_SELECTORS (SELGRPID);
create index IDX_SELECTOR_CKEY on BPEL_SELECTORS (CORRELATION_KEY);
create index IDX_SELECTOR_CORRELATOR on BPEL_SELECTORS (CORRELATOR);
create index IDX_UNMATCHED_CORRELATOR on BPEL_UNMATCHED (CORRELATOR);
create index IDX_UNMATCHED_CKEY on BPEL_UNMATCHED (CORRELATION_KEY);
create table hibernate_unique_key ( next_hi int );
insert into hibernate_unique_key values ( 0 );
