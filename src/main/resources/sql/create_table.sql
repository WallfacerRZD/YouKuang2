drop table youkuang_user;
create table youkuang_user(
  userID int(10) auto_increment,
  userName varchar(32) not null,
  password varchar(32) not null,
  primary key (userName)
);

insert into youkuang_user(userName, password) values ('不愿意透露姓名的网友',123);