-- Apache ODE - SimpleScheduler Database Schema
--
-- MySQL scripts by Maciej Szefler.
--
--
DROP TABLE IF EXISTS ODE_JOB;

CREATE TABLE ODE_JOB (
  jobid char(64)  NOT NULL,
  ts bigint  NOT NULL DEFAULT 0,
  nodeid char(64)  NULL,
  scheduled INTEGER  NOT NULL DEFAULT 0,
  transacted INTEGER  NOT NULL DEFAULT 0,
  instanceId BIGINT,
  mexId varchar(254),
  processId varchar(254),
  type varchar(254),
  channel varchar(254),
  correlatorId varchar(254),
  correlationKeySet varchar(254),
  retryCount INTEGER,
  inMem INTEGER,
  detailsExt BLOB,
  PRIMARY KEY (jobid)
);

CREATE INDEX IDX_ODE_JOB_TS on ODE_JOB(ts);
CREATE INDEX IDX_ODE_JOB_NODEID on ODE_JOB(nodeid);
