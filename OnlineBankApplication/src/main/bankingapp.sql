create database bankingapp;
use bankingapp;
create table users(
user_uid int primary key ,
name varchar(30),
email varchar(30),
password varchar(30),
phone bigint);