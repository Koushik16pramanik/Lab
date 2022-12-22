package com.Cms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cms")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)//allows auto generation for field value
@Column(name="reg_id")
private int Id;
@Column(name="stu_firstName",length=20,nullable=false)
private String firstName;
@Column(name="stu_lastName",length=20,nullable=false)
private String lastName;
@Column(name="clg_fees")
private double fees;
@Column(name="emp_phone",length=11,unique=true)
private long phone;
@Column(name="stu_email")
private String email;
public int getId() {
	return Id;
}
public void setId(int id) {
	this.Id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}

