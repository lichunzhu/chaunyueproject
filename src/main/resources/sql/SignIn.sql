drop  table  if exists SignIn;


-- auto-generated definition
create table SignIn
(
  id       bigint       not null primary key auto_increment ,
  uid      varchar(255) null,
  password varchar(255) null,
  role     varchar(255) null
)CHARACTER SET utf8 COLLATE utf8_general_ci;
