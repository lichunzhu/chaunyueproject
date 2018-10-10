drop  table  if exists U_Q;

-- auto-generated definition
create table U_Q
(
  id  bigint       not null
    primary key,
  uid varchar(255) null,
  qid bigint       null,
  constraint U_Q_UserInfo_uid_fk
  foreign key (uid) references UserInfo (uid)
    on update cascade
    on delete cascade,
  constraint U_Q_Question_qid_fk
  foreign key (qid) references Question (qid)
    on update cascade
    on delete cascade
)
  comment '用户与问题之间的关联表'
  charset = utf8;

create index U_Q_Question_qid_fk
  on U_Q (qid);

create index U_Q_UserInfo_uid_fk
  on U_Q (uid);
