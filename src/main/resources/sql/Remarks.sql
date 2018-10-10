drop  table  if exists Remarks;

-- auto-generated definition
create table Remarks
(
  id      bigint          not null
    primary key,
  dtr     varchar(255)    null,
  dtrmess varchar(255)    null,
  ctr     varchar(255)    null,
  ctrmess varchar(255)    null,
  state   int default '0' null,
  constraint Remarks_UserInfo_uid_fk
  foreign key (dtr) references UserInfo (uid)
    on update cascade
    on delete cascade,
  constraint Remarks_UserInfo_uid_fk_2
  foreign key (ctr) references UserInfo (uid)
    on update cascade
    on delete cascade
)
  charset = utf8;

create index Remarks_UserInfo_uid_fk
  on Remarks (dtr);

create index Remarks_UserInfo_uid_fk_2
  on Remarks (ctr);

