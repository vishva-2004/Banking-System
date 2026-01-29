create database bankingapp;
use bankingapp;
create table users(
user_id int primary key auto_increment,
name varchar(30) not null,
email varchar(30)unique not null,
password varchar(30) not null,
phone varchar(10), 
create_at timestamp default current_timestamp);


create table accounts(
account_no bigint primary key auto_increment,
user_id int,
balance double default 0,
account_type varchar(20),
create_at timestamp default current_timestamp,
foreign key accounts (user_id) references users(user_id));

create table transactions(
trs_id int primary key auto_increment,
account_no bigint,
trs_type varchar(30),
amount double,
trs_date timestamp default current_timestamp,
foreign key (account_no) references accounts(account_no));

insert into users (name, email, password, phone) values
('Arun Kumar', 'arun@gmail.com', 'arun123', '9876543210'),
('Priya Sharma', 'priya@gmail.com', 'priya123', '9123456780');

insert into accounts (account_no, user_id, balance, account_type) values
(10010001, 1, 5000, 'SAVINGS'),
(10010002, 2, 8000, 'SAVINGS');

insert into transactions (account_no, trs_type, amount) values
(10010001, 'DEPOSIT', 2000),
(10010001, 'WITHDRAW', 1000),
(10010002, 'DEPOSIT', 3000);
