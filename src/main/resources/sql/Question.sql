drop  table  if exists Question;

-- auto-generated definition
create table Question
(
  qid      bigint       not null
    primary key,
  question varchar(255) null
)CHARACTER SET utf8 COLLATE utf8_general_ci
  comment '这个是答题的表';

