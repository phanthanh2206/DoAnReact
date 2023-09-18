DROP DATABASE IF EXISTS employee_management ;
CREATE DATABASE employee_management;
USE employee_management;

CREATE TABLE `account` (
    account_id INT AUTO_INCREMENT NOT NULL,
    full_name VARCHAR(50) NOT NULL,
    username VARCHAR(20) NOT NULL,
    `password` VARCHAR(20) NOT NULL,
    email VARCHAR(20) NOT NULL,
    age INT NOT NULL,
    gender INT NOT NULL,
    address VARCHAR(100),
    dob DATE,
    skill VARCHAR(200),
    `level` VARCHAR(20),
    department_id INT NOT NULL,
    position_id INT NOT NULL,
    role_id INT NOT NULL,
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (account_id),
    FOREIGN KEY (department_id)
        REFERENCES department (department_id),
    FOREIGN KEY (position_id)
        REFERENCES `position` (position_id),
    FOREIGN KEY (role_id)
        REFERENCES `role` (role_id)
);

CREATE TABLE `role` (
    role_id INT AUTO_INCREMENT NOT NULL,
    role_name VARCHAR(50) NOT NULL,
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (role_id)
);

CREATE TABLE department (
    department_id INT AUTO_INCREMENT NOT NULL,
    department_name VARCHAR(50) NOT NULL,
    `description` VARCHAR(400),
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (department_id)
);

CREATE TABLE `position` (
    position_id INT AUTO_INCREMENT NOT NULL,
    position_name VARCHAR(50) NOT NULL,
    `description` VARCHAR(400),
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (position_id)
);

CREATE TABLE contract (
    contract_id INT AUTO_INCREMENT NOT NULL,
    account_id INT NOT NULL,
    duration VARCHAR(20) NOT NULL,
    pay_roll FLOAT NOT NULL,
    annual FLOAT NOT NULL,
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (contract_id),
    FOREIGN KEY (account_id)
        REFERENCES `account` (account_id)
);

CREATE TABLE salary (
    salary_id INT AUTO_INCREMENT NOT NULL,
    actual_salary FLOAT NOT NULL,
    pay_date DATE,
    leave_id INT NOT NULL,
    bonus_id INT NOT NULL,
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (salary_id),
    FOREIGN KEY (leave_id)
        REFERENCES `leave` (leave_id),
    FOREIGN KEY (bonus_id)
        REFERENCES bonus (bonus_id)
);

CREATE TABLE `leave` (
    leave_id INT AUTO_INCREMENT NOT NULL,
    account_id INT NOT NULL,
    reason VARCHAR(200),
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (leave_id),
    FOREIGN KEY (account_id)
        REFERENCES `account` (account_id)
);

CREATE TABLE bonus (
    bonus_id INT AUTO_INCREMENT NOT NULL,
    account_id INT NOT NULL,
    reason VARCHAR(200),
    created_dated DATE,
    updated_date DATE,
    created_by INT,
    updated_by INT,
    PRIMARY KEY (bonus_id),
    FOREIGN KEY (account_id)
        REFERENCES `account` (account_id)
);











