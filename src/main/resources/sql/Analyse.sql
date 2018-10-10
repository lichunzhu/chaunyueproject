drop  table  if exists Analyse;

-- auto-generated definition
create table Analyse
(
  id     bigint       null,
  uid    varchar(255) null,
  fwymsj float        null,
  tlsj   float        null,
  fwql   float        null,
  hyd    float        null
)
  comment '分析用户的表'
CHARACTER SET utf8 COLLATE utf8_general_ci;

