use C2268;
create table Customer(
Cust_id varbinary(6) primary key,
Fname  varchar(20) not null, Lname varchar(20) not null, 
Area numeric(5) not null, Phone bigint(10) );
create table Movie(
MV_no int primary key auto_increment, 
Title varchar(5) not null, Cust_id varchar(5),
Star varchar(10) not null, Price integer(6) );
insert into Customer values
('A01','Ivan', 'Rose', 'SA', '6125467'),
('A02','Vandana', 'Ray', 'MU', '5560379'),
('A03', 'Pramada', 'Jauguste','DA', '4560389'),
('A04', 'Basu', 'Navindi','BA', '6125401'),
('A05', 'Ravi', 'Shridhar', 'NA', null),
('A06', 'Rukmini', 'Aiyer','GH', '5125274');
insert into Movie values
(1,'A02','Bloody','JC',181),
(2,'A04','The Firm','TC',200),
(3,'A01','Pretty Woman','RG',151),
(4,'A02','Home Alone','MC',150),
(5,'A05','The Fugitive','MF',200),
(6,'A03','Coma','MD',100),
(7,'A02','Dracula','GO',150),
(8,'A06','Quick Change','BM',100),
(9,'A03','Gone with the Wind','CB',200),
(10,'A05','Carry on Doctor','LP',100);
#price is greater than 100 but less 200
select * from Movie;
select Title from Movie where Price between 100 and 200;