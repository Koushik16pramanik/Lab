package Lab;
/*
 Write a java class to develop an employee class object using
constructor. The constructor initialized the emp name & emp Id for 5
Emp now write another class having name and from this class you have
to create 5 employee objects but you are not allowed to use new
keyword.
 */
import Oerateor.*;

public class Employee {
		long employeeId;
		String employeeName;
		String employeeAddress;
		long employeePhone;
		double basicSalary;
		double specialAllowance;
		double Hra;
		static String employeedetails=" ";
		Employee(long employeeId, String employeeName, long employeePhone){
			this.employeeId=employeeId;
			this.employeeName=employeeName;
			this.employeeAddress=employeeAddress;
			this.employeePhone=employeePhone;
			this.basicSalary=basicSalary;
			this.specialAllowance=specialAllowance;
			this.Hra=Hra;
		}
		public Employee(String string) {
		}
		void show() {
			System.out.println(employeeId+" "+employeeName+" "+employeeAddress+ " "+employeePhone+" "+basicSalary+" "+specialAllowance+" "+Hra);
		}
	public class Employee1{
		public static void main(String[] args) {
			Employee s1=new Employee("Enter any new employee details");
			s1.show();
	}}}