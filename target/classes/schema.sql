CREATE TABLE employeeskill (
 employeeid varchar(100) NOT NULL,
 skillid varchar(100) NOT NULL
 );
CREATE TABLE projectskill 
(
 Id SERIAL ,
 skillid varchar(100) NOT NULL,
 projectid varchar(100) NOT NULL,
 PRIMARY KEY (Id)
);

CREATE TABLE employeeProjectPeriod
(
 id varchar(100) NOT NULL ,
 employeeid varchar(100) NOT NULL,
 idProject varchar(100) NOT NULL,
 startDate DATE DEFAULT CURRENT_DATE,
 endDate DATE,
 dedication varchar(100) NOT NULL
 
);

CREATE TABLE Employee
(
 Name varchar(100) NOT NULL,
 Id varchar(100) NOT NULL ,
 hireDate DATE DEFAULT CURRENT_DATE,
 Password varchar(100) NOT NULL,
 Surname varchar(100) DEFAULT NULL,
 Email varchar(100) DEFAULT NULL,
 PRIMARY KEY (Id)
);

CREATE TABLE user_pacman
(
 Name varchar(100) NOT NULL,
 hireDate DATE DEFAULT CURRENT_DATE,
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
 StartDate DATE DEFAULT CURRENT_DATE,
 EndDate DATE,
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
startDate DATE DEFAULT CURRENT_DATE,
endDate DATE,

PRIMARY KEY(Id)

);