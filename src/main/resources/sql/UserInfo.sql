drop  table  if exists UserInfo;

-- auto-generated definition
create table UserInfo
(
  uid           varchar(255) not null
    primary key,
  nickname      varchar(255) null,
  gender        varchar(255) null,
  age           int          null,
  constellation varchar(255) null,
  schoolname    varchar(255) null,
  hometown      varchar(255) null,
  signature     varchar(255) null,
  phoneno       varchar(255) null,
  weichatno     varchar(255) null,
  imagepath     varchar(255) null,
  certification varchar(255) null,
  characters    varchar(255) null,
  birth         timestamp    null,
  height        float        null,
  weight        float        null,
  university    varchar(255) null,
  major         varchar(255) null,
  interest      varchar(255) null
)
  comment '存储用户信息的表'
  charset = utf8;

