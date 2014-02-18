-- Apache ODE - SimpleScheduler Database Schema
--
-- MySQL scripts by Maciej Szefler.
--
--
DROP TABLE IF EXISTS ODE_JOB;

CREATE TABLE ODE_JOB (
  jobid char  NOT NULL DEFAULT '',
  ts bigint  NOT NULL DEFAULT 0,
  nodeid char  NULL,
  scheduled int  NOT NULL DEFAULT 0,
  transacted int  NOT NULL DEFAULT 0,

  instanceId bigint,
  mexId varchar(255),
  processId varchar(255),
  type varchar(255),
  channel varchar(255),
  correlatorId varchar(255),
  correlationKeySet varchar(255),
  retryCount int,
  inMem int,
  detailsExt varbinary(4096),

  PRIMARY KEY(jobid)
);

CREATE INDEX IDX_ODE_JOB_TS ON ODE_JOB(ts);
CREATE INDEX IDX_ODE_JOB_NODEID ON ODE_JOB(nodeid);

