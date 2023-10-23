CREATE DATABASE group_management;
USE group_management;
CREATE TABLE `group`(
group_id INT AUTO_INCREMENT,
group_name VARCHAR(30),
`member` INT NOT NULL,
creator VARCHAR(30),
created_date DATE,
PRIMARY KEY(group_id));
CREATE TABLE `user`(
user_id INT AUTO_INCREMENT,
user_name VARCHAR(20) UNIQUE NOT NULL,
`password` VARCHAR(200) NOT NULL,
`role` VARCHAR(20) NOT NULL,
PRIMARY KEY(user_id)
);