drop  table  if exists Album;

-- auto-generated definition
create table Album
(
  id        bigint       not null
    primary key,
  uid       varchar(255) null,
  pictureId bigint       null
)
CHARACTER SET utf8 COLLATE utf8_general_ci
  comment '相册表';

