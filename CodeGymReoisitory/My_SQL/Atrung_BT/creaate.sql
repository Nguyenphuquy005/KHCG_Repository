create database first_database ;
use first_database ;
create table Categories(
   Id int primary key auto_increment not null ,
   Name nvarchar(50) unique not null, 
    Description nvarchar(500) 
) ;
create table Suppliers(
Id int primary key auto_increment not null ,
Name nvarchar(100) not null,
Email varchar(50) not null unique,
Phonenumber varchar(50) ,
Adress nvarchar(500) not null
) ;
CREATE TABLE Customers (
    Id VARCHAR(50) PRIMARY KEY not null,
    fistname NVARCHAR(50) not null,
    lastname NVARCHAR(50) not null,
    phonrNumber VARCHAR(50),
    adress NVARCHAR(500) not null,
    email VARCHAR(50) not null unique,
    brithday DATETIME
);
CREATE TABLE Employees (
    Id VARCHAR(50) PRIMARY KEY not null,
    fistname NVARCHAR(50) not null,
    lastname NVARCHAR(50) not null,
    phonrNumber VARCHAR(50) ,
    adress NVARCHAR(500) not null,
    email VARCHAR(50) not null unique,
    brithday DATETIME
);
create table Products (
Id int primary key auto_increment not null,
Name nvarchar(100) not null,
UmagUrl nvarchar(1000) not null,
price decimal(18,2) ,
discount decimal(18,2),
stock decimal(18,2),
categoryId  int ,
 foreign key(categoryId) references Categories(Id) ,
supplierId int ,
foreign key(supplierId) references  `first_database`.Suppliers(Id) ,
description nvarchar(1000) 
);
