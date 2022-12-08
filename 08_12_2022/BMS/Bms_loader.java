package Com.Bms.Bms_loader;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Pattern;

import  Com.Bms.Helper;

class DuplicateAccNoException extends Exception{
	DuplicateAccNoException(String str){
		super(str);
	}
}
class DuplicatePinException extends Exception{
	DuplicatePinException(String str){
		super(str);
	}
}
class AccNoNotFoundException extends Exception{
	AccNoNotFoundException(String str){
		super(str);
	}
}
class WrongpinException extends Exception{
	WrongpinException(String str){
		super(str);
	}
}
class InsufficientBalance extends Exception{
	InsufficientBalance(String str){
		super(str);
	}
}
class InvalidPasswordException extends Exception{
	InvalidPasswordException(String str){
		super(str);
	}
}

public class Bms_loader {
	Scanner sc= new Scanner(System.in);
	int pin;
	long acc_no;
	double balance;
	String acc_holder,ifsc_code,branch,acc_type;
	
	public void storeData() throws Exception {
		System.out.println("Enter account number : (Please entre your 10 digit account numbers) : ");
		acc_no=sc.nextLong();
		while(!Pattern.matches("[0-9]{1}[0-9]{9}", String.valueOf(acc_no))) {
			System.err.println("Invalid account no....."
					+ "\nEntre the correct account no : ");
			acc_no=sc.nextLong();
		}
		System.out.println("Enter account holder name : ");
		acc_holder=sc.next();
		System.out.println("Enter ifsc code : (Please entre 2 digit letter & 3 digits numbers) :");
		ifsc_code=sc.next();
		while(!Pattern.matches("[a-zA-Z]{2}[0-9]{3}", ifsc_code)) {
			System.err.println("Invalid ifsc code....."
					+ "\nEntre valid ifsc code : ");
			ifsc_code=sc.next();
		}
		System.out.println("Enter bank branch : ");
		branch=sc.next();
		System.out.println("choose from account type : ([s for saving]/[c for current])");
		String acc_type=sc.next();
		while(!acc_type.equalsIgnoreCase("s")&&!acc_type.equalsIgnoreCase("c")) {
			System.out.println("  Sorry...This accounts facility are not avaliable in this time ..."
					+ "\nKindly choose avaliable facilitis : ");
			acc_type=sc.next();
		}
		System.out.println("Enter amount : ");
		balance=sc.nextDouble();
		while(balance<1000) {
			System.out.println("  Minimum balance 1000 required to create a new account....."
					+ "\nEntre sufficient balance : ");
			balance=sc.nextDouble();
		}
		System.out.println("Create pin : (Entre your 4 digit pin) :");
		pin=sc.nextInt();
		while(!Pattern.matches("[0-9]{1}[0-9]{3}",String.valueOf(pin))) {
			System.err.println("Invalid Pin..."
					+ "\nEntre the correct pin : ");
			pin=sc.nextInt();
		}
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs1=stmt.executeQuery("select acc_no from bank where acc_no="+acc_no);
		if(rs1.next()) {
			throw new DuplicateAccNoException("  Duplicate Account no. will not accepted  ");
		}else {
			rs1=stmt.executeQuery("select pin from bank where pin="+pin);
			if(rs1.next()) {
				throw new DuplicatePinException("  Duplicate pin not valid.  ");
			}else {
				PreparedStatement pstmt=conn.prepareStatement("insert into bank values(?,?,?,?,?,?,?)");
				pstmt.setLong(1,acc_no);
				pstmt.setString(2, acc_holder);
				pstmt.setString(3, ifsc_code);
				pstmt.setString(4, branch);
				pstmt.setString(5, acc_type);
				pstmt.setDouble(6, balance);
				pstmt.setInt(7,pin);
				pstmt.executeUpdate();
				System.out.println("Your Account will created successfully");
			}
		}	
	}
	public void displayData() throws SQLException, AccNoNotFoundException, WrongpinException {
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Enter account no. : ");
		acc_no=sc.nextLong();
		ResultSet rs=stmt.executeQuery("select*from bank where acc_no="+acc_no);
		if(!rs.next()) {
			throw new AccNoNotFoundException("  Account no. not found  ...\nEnter correct account no. or "
					+ "create a new account.");
		}else {
			System.out.println("Enter pin : ");
			pin=sc.nextInt();
			if(rs.getInt(7)!=pin) {
					throw new WrongpinException("  Wrong pin  ");
			}else {
				System.out.println("[Account No] : "+rs.getLong(1)+"\n[Account Holder] : "+rs.getString(2)
						+"\n[IFSC Code] : "+rs.getString(3)+"\n[Branch] : "+
						rs.getString(4)+"\n[Account Type] : "+rs.getString(5)+
						"\n[Balance] : "+rs.getDouble(6)+"\n[Pin] : "+rs.getInt(7));
			}
		}
	}
	public void updateData(int choice) throws SQLException, AccNoNotFoundException, WrongpinException, InsufficientBalance {

		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Enter account no. : ");
		acc_no=sc.nextLong();
		ResultSet rs=stmt.executeQuery("select*from bank where acc_no="+acc_no);
		if(!rs.next()) {
			throw new AccNoNotFoundException("  Account no. not found  ...\nEnter correct account no. or "
					+ "create a new account.");
		}else {
			System.out.println("Enter pin : ");
			pin=sc.nextInt();
			if(rs.getInt(7)!=pin) {
					throw new WrongpinException("***Wrong pin***");
			}else {
				if(choice==3) {
					new Bms_loader().deposit(acc_no);
				}else if(choice==4) {
					new Bms_loader().withdraw(acc_no);
				}else if(choice==5) {
					new Bms_loader().changePin(acc_no);
				}
			}
		}	
	}
	public void deposit(long acc_no) throws SQLException {
		System.out.println("Enter your deposit amount : ");
		balance=sc.nextDouble();
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("select balance from bank where acc_no="+acc_no);
		stmt.executeUpdate("update bank set balance=balance+"+balance+" where acc_no="+acc_no);
		System.out.println("Amount deposited successfully...");
		ResultSet rs=stmt.executeQuery("select balance from bank where acc_no="+acc_no);
		while(rs.next()) {
			System.out.println("Current balance : "+rs.getDouble(1));
		}
	}
	public void withdraw(long acc_no) throws SQLException, InsufficientBalance {
		System.out.println("Enter withdraw money : ");
		balance=sc.nextDouble();
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs1=stmt.executeQuery("select balance from bank where acc_no="+acc_no);
		while(rs1.next()) {
			if(balance>rs1.getDouble(1)) {
				throw new InsufficientBalance("  You don't have sufficient balance in your account   "
						+ "\nCurrent Balance : "+rs1.getDouble(1));
			}else {
				stmt.executeUpdate("update bank set balance=balance-"+balance+" where acc_no="+acc_no);
				System.out.println("Withdrawall Transjection will completed...");
				rs1=stmt.executeQuery("select balance from bank where acc_no="+acc_no);
				while(rs1.next()) {
					System.out.println("Remaining balance : "+rs1.getDouble(1));
				}
			}
		}
	}
	public void changePin(long acc_no) throws SQLException {
		System.out.println("Enter new pin : ");
		pin=sc.nextInt();
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		stmt.executeUpdate("update bank set pin="+pin+" where acc_no="+acc_no);
		System.out.println("Pin updated successfull...");
	}
}

