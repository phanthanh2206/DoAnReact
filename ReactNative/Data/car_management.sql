DROP DATABASE IF EXISTS car_management ;
CREATE DATABASE car_management;
USE car_management;

create table Car(
car_id int auto_increment not null,
lisence_plate varchar(10) unique not null,
repair_date date ,
customer_name varchar(30) not null,
catalogs varchar(100) not null,
car_maker varchar(100) not null,
primary key(car_id)
);
create table Accessory(
accessory_id int auto_increment not null,
`name` varchar(30) not null,
price float not null,
status_damaged varchar(100) not null,
repair_status varchar(100) not null,
car_id int not null,
primary key(accessory_id),
foreign key (car_id) references Car(car_id)
)