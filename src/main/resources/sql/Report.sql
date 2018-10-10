drop  table  if exists Report;

-- auto-generated definition
create table Report
(
  id   bigint auto_increment
    primary key,
  uid  varchar(255) null,
  mass varchar(255) null,
  uid2 varchar(255) null
)
  comment '举报表'CHARACTER SET utf8 COLLATE utf8_general_ci;

