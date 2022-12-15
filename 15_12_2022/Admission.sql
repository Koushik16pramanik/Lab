use mydb;
create table Admission (
Registration_ID int primary key auto_increment, Name varchar(20), address varchar(20),
phone_no bigint(10), course varchar(10), 10th_mark numeric(12,2),
12th_marks numeric(12,2), Year_of_passing_12th integer (15)
); 