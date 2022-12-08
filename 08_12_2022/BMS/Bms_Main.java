package Com.Bms.Main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import Com.Bms.Helper;
import Com.Bms.Bms_loader.Bms_loader;

public class Bms_Main {
		public static void main(String[] args) {
			Bms_loader bms=new Bms_loader();
			Scanner sc=new Scanner(System.in);
			System.out.println("=*=*=*=*=*=Welcome to our Bank=*=*=*=*=*=");
			while(true) {
				System.out.println("[1.Create Account]");
						System.out.println("[2.Display Details]");
						System.out.println("[3.Deposit]");
						 System.out.println("[4.Withdraw]");
						System.out.println("[5.Change Pin],");
						System.out.println("[0.Exit]");
				int choice=sc.nextInt();
				while(!(choice>=0 && choice<6)) {
					System.err.println("Invalid entry...\nChoose correct one : ");
					choice=sc.nextInt();
				}
				if(choice==0) {
					System.out.println("=*=*=*=*=*=*=Thank You Visit Again=*=*=*=*=*=*=");
					break;
				}else {
					try {
						if(choice==1) {
							bms.storeData();
						}else if(choice==2) {
							bms.displayData();
						}else if(choice==3 || choice==4 || choice==5) {
							bms.updateData(choice);
						}
					}catch(InputMismatchException e) {
						System.out.println("  Invalid entry  ");
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}finally {
						System.out.println("[1-->Main Menu],[0-->Exit]");
						int choice1=sc.nextInt();
						while(!(choice1==0||choice1==1)) {
							System.err.println("Invalid entry...\nChoose the Valid number : ");
							choice1=sc.nextInt();
						}
						if(choice1==1) {
							continue;
						}else if(choice1==0) {
							System.out.println("=*=*=*=*=*=Thank you visit again=*=*=*=*=*=*=");
							break;
						}
					}
				}
			}
		}
	}


