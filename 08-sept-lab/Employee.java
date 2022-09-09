package Lab;
/*
Write a java class to develop an employee class object using 
constructor.
The constructor hold initialized the emp name & emp Id for 5 Emp
now write another class having name and from this class you have to 
create 5 employee objects but 
you are not allowed to use new keyword.
 */
public class Employee {
	String empname;
	 int id;
	  Employee(String empname,int id){
		this.empname=empname;
		this.id=id;
	}
  void show() {
	 System.out.println(empname+" "+id);
}}
class Employees{
	public static void main(String[] args) {
		Employee e=new Employee("apu",27);
		Employee e2=new Employee("suman",23);
		Employee e3=new Employee("bivas",19);
		Employee e4=new Employee("rick",13);
		e.show();
		e2.show();
		e3.show();
		e4.show();
	}}
