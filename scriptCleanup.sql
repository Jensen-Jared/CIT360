drop database if exists HibernateExample;

create database HibernateExample;
use HibernateExample;

create table app_user (
user_id int auto_increment,
uname varchar(20),
pword varchar(20),
active int,
manager_level int,
session varchar(20000),
phoneNumber varchar(20),
primary key(user_id)
);

Create table phone_number(
phone_id int auto_increment,
phoneNumber varchar(20),
primary key(phone_id)
);

create table fish (
fish_id int auto_increment,
fish_name varchar(20),
fish_type varchar(20),
session varchar(2000),
primary key(fish_id)
);