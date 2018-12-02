drop table youkuang_user;
create table youkuang_user(
  userid int(10) auto_increment,
  userName varchar(32) not null,
  password varchar(32) not null,
  primary key (userName)
);

insert into youkuang_user(userid, userName, password) values (111,'不愿意透露姓名的网友',123);