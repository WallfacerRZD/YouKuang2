drop table youkuang_user;
drop table account;
drop table account_item;
create table youkuang_user(
  userId serial,
  userName varchar(32) not null,
  password varchar(32) not null,
  primary key (userId)
);
create table account(
  accountID serial,
  accountName varchar(32) not null,
  UserID int not null,
  sum numeric,
  lastModifiedTime timestamp,
  createdTime timestamp,
  primary key (AccountID)
);

create table account_item(
  iNO serial,
  inOut varchar(32) not null,
  money numeric,
  time timestamp,
  item_type int not null,
  tip varchar(50) not null,
  primary key (iNo)
);

/*test*/

insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友',123);
insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友2',456);
insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友3',789);

delete from youkuang_user where userName = '一个不愿意透露姓名的网友3';

insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友4',233);