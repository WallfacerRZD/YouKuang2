drop table team_member;
create table team_member (
  studentID varchar(32),
  name varchar(8),
  birthday date,
  hobby varchar(128),
  primary key (studentID)
);

insert into team_member(studentID, name, birthday, hobby)
              values('2016141462307', '冉哲东', '1997-8-11', '吃, 喝, 睡');

insert into team_member(studentID, name, birthday, hobby)
              values('2016141462251', '康睿', '1998-12-23', '吃，吃，吃');

insert into team_member(studentID, name, birthday, hobby)
              values('2016141462316', '范元晓', '1998-02-11', '吃饭, 睡觉, 发呆');