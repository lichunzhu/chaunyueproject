drop  table  if exists Feedback;

-- auto-generated definition
create table Feedback
(
  id   bigint auto_increment
    primary key,
  uid  varchar(255) null,
  mess varchar(255) null
)
CHARACTER SET utf8 COLLATE utf8_general_ci;

