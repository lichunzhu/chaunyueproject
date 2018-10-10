drop  table  if exists CP;

-- auto-generated definition
create table CP
(
  id   bigint       not null
    primary key,
  uid1 varchar(255) null,
  uid2 varchar(255) null,
  constraint CP_UserInfo_uid_fk
  foreign key (uid1) references UserInfo (uid)
    on update cascade
    on delete cascade,
  constraint CP_UserInfo_uid_fk_2
  foreign key (uid2) references UserInfo (uid)
    on update cascade
    on delete cascade
)
  comment '记录已组成CP的信息'
  charset = utf8;

create index CP_UserInfo_uid_fk
  on CP (uid1);

create index CP_UserInfo_uid_fk_2
  on CP (uid2);