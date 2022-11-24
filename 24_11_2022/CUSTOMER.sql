use C2268;
create table CUSTOMER(
cust_id varchar(5) not null,Fname varchar(15) not null, Lname varchar(15) not null, Area char(2) not null, 
Phone numeric(10), DOB date, Payment bigint(10)
);
#inserting datas into CUSTOMER table
insert into CUSTOMER values
('A01','Ivan', 'Rose', 'SA', '6125467', '15-jan-86', '800.50'),
('A02','Vandana', 'Ray', 'MU', '5560379', '20-DEC-87', '1000.75'),
('A03', 'Pramada', 'Jauguste','DA', '4560389', '25-jul-56', '500.00'),
('A04', 'Basu', 'Navindi','BA', '6125401', '28-feb-56', '860.00'),
('A05', 'Ravi', 'Shridhar', 'NA', null, '15-feb-89', '500.50'),
('A06', 'Rukmini', 'Aiyer','GH', '5125274', '23-jul-87', '1500.50');
# add a row
select * from CUSTOMER;
insert into CUSTOMER values ('A07', 'Ravi', 'Ray','MU', '6125401', '02-jul-87', '1000.50');
#update phone numbers
select * from CUSTOMER;
update CUSTOMER set Phone= '5648521' where cust_id='A02';
update CUSTOMER set Phone= '6380417' where cust_id='A04';
#update date of birth
select * from CUSTOMER;
update CUSTOMER set DOB= '12-jun-65' where cust_id= 'A03';
update CUSTOMER set DOB= '12-jun-65' where cust_id= 'A04';
#delete 2 rows
select * from CUSTOMER;
DELETE FROM CUSTOMER WHERE cust_id= 'A01';
DELETE FROM CUSTOMER WHERE cust_id= 'A05';
#delete all the rows from the table
select * from CUSTOMER;
truncate table CUSTOMER;
# delete (structure & record)
select * from CUSTOMER;
drop table CUSTOMER;