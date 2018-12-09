drop table youkuang_user;
drop table account;
drop table type;
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
  sum double precision,
  lastModifiedTime timestamp,
  createdTime timestamp,
  primary key (AccountID)
);

create table type(
  typeID serial,
  typeName  varchar(32) not null,
  primary key (typeID)
);

/*test*/

insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友',123);
insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友2',456);
insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友3',789);
delete from youkuang_user where userName = '一个不愿意透露姓名的网友3';
insert into youkuang_user(userName, password) values ('一个不愿意透露姓名的网友4',233);

insert into type(typeName) values ('工资');
insert into type(typeName) values ('零食烟酒');
insert into type(typeName) values ('餐饮');
insert into type(typeName) values ('购物');
insert into type(typeName) values ('交通');
insert into type(typeName) values ('娱乐');
insert into type(typeName) values ('文教');
insert into type(typeName) values ('通讯');
insert into type(typeName) values ('人情往来');
insert into type(typeName) values ('投资');
insert into type(typeName) values ('其他');