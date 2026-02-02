create database user;
use user;
create table client(
Username varchar(30),
password varchar(30),
email varchar(30),
phone varbinary(10));

insert into client (username,password) values("df", "ds");
select * from client;