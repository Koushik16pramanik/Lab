use mydb;
create table Department( Department_ID int(5) Primary Key, Department_Name Varchar(20) not null,	
Department_Head Varchar(15) not null, Department_Description Varchar(20) not null);

create table Employee(	Employee_Id int(5) Primary key, Employee_Name Varchar(20) not null,
Employee_Address Varchar(20) not null,  Employee_Salary Decimal(15) not null,
Employee_Contact_No bigint(15), Department_ID int(5), foreign key(Department_ID) references Department(Department_ID)
);
