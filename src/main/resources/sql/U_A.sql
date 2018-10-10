drop  table  if exists U_A;

-- auto-generated definition
create table U_A
(
  id  bigint       not null
    primary key,
  uid varchar(255) null,
  aid bigint       null,
  constraint U_A_UserInfo_uid_fk
  foreign key (uid) references UserInfo (uid)
    on update cascade
    on delete cascade,
  constraint U_A_Answer_aid_fk
  foreign key (aid) references Answer (aid)
    on update cascade
    on delete cascade
)
  comment '用户与答案之间的关联表'
  charset = utf8;

create index U_A_Answer_aid_fk
  on U_A (aid);

create index U_A_UserInfo_uid_fk
  on U_A (uid);

