package Com.Employee.Validation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Com.Employee.Helper;

public class Employee_Valid {
	static int count;
	static public void EmployeeDetails (int Emp_id) throws SQLException {
		// creating connection from helper class
		Connection conn= Helper.con();
		// executing fetch data from database
		Statement stmt= conn.createStatement();
	ResultSet rs= stmt.executeQuery("select * from employee where employee_id= "+Emp_id);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
			count++;
	        }}
		if (count== 0) {
			System.out.println("id not valid");
	    }
	}

}
