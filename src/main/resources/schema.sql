CREATE TABLE employeeProjectPeriod
(
 Id varchar(100) NOT NULL ,
 idEmployee varchar(100) NOT NULL,
 idProject varchar(100) NOT NULL,
 startDate varchar(100) NOT NULL,
 endDate varchar(100) NOT NULL,
 dedication varchar(100) NOT NULL,
 
 PRIMARY KEY (Id)
);
CREATE TABLE employeeproject
(
 Id varchar(100) NOT NULL ,
 employeeid varchar(100) NOT NULL,
 projectid varchar(100) NOT NULL,
 
 
 PRIMARY KEY (Id)
);
CREATE TABLE Employee
(
 Name varchar(100) NOT NULL,
 Id varchar(100) NOT NULL ,
 Password varchar(100) NOT NULL,
 Surname varchar(100) DEFAULT NULL,
 Email varchar(100) DEFAULT NULL,

 
 PRIMARY KEY (Id)
);

CREATE TABLE user_pacman
(
 Name varchar(100) NOT NULL,
 Id varchar(100) NOT NULL ,
 Password varchar(100) NOT NULL,
 Surname varchar(100) DEFAULT NULL,
 Email varchar(100) DEFAULT NULL,

 
 PRIMARY KEY (Id)
);
CREATE TABLE project
(
 Name varchar(100) NOT NULL,
 Id varchar(100) NOT NULL ,
 Description varchar(1000) NOT NULL,
 StartDate varchar(100) DEFAULT NULL,
 EndDate varchar(100) DEFAULT NULL,

 
 PRIMARY KEY (Id)
);

CREATE TABLE skill 
(
Name varchar (100) NOT NULL,
Description varchar(1000) NOT NULL,
Id varchar(100) NOT NULL,

PRIMARY KEY(Id)

);
CREATE TABLE absence 
(
Id varchar(100) NOT NULL,
EmployeeId varchar (100) NOT NULL,
Type varchar (100) NOT NULL,
Description varchar(1000) NOT NULL,
startDate varchar(100) NOT NULL,
endDate varchar(100) NOT NULL,

PRIMARY KEY(Id)

);