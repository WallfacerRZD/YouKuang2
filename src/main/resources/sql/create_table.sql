drop table youkuang_user;
drop table account;
create table youkuang_user(
  userId serial,
  userName varchar(32) not null,
  password varchar(32) not null,
  primary key (userId)
);
create table account(
  AccountID serial,
  AccountName varchar(32) not null,
  UserID int not null,
  sum double precision,
  primary key (AccountID)
);

/*test*/

insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友',123);
insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友2',456);
insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友3',789);

delete from youkuang_user where userName = '一个不愿意透露姓名的网友3';

insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友4',233);