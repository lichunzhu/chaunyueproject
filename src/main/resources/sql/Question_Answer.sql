drop  table  if exists Q_A;

-- auto-generated definition
create table Q_A
(
  id  bigint not null
    primary key,
  qid bigint null,
  aid bigint null,
  constraint Q_A_Question_qid_fk
  foreign key (qid) references Question (qid)
    on update cascade
    on delete cascade,
  constraint Q_A_Answer_aid_fk
  foreign key (aid) references Answer (aid)
    on update cascade
    on delete cascade
)
  charset = utf8;

create index Q_A_Answer_aid_fk
  on Q_A (aid);

create index Q_A_Question_qid_fk
  on Q_A (qid);