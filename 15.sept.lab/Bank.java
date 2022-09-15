package Lab;

import java.awt.print.Book;

/*
 4…Consider a scenario where Bank is a class that provides functionality to get the rate 
of interest. However, the rate of interest varies according to banks. For example, SBI, 
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest
 */
public class Bank {

	int getInterest() {
		return 0;
	}}
class Sbi extends Bank{
	int getInterest() {
		return 8;
		
	}}
class Icici extends Bank{
	int getInterest() {
		return 7;
		
	}}
class Axis extends Bank{
	int getInterest() {
		return 9;
	}}
class execute {
	public static void main(String...args) {
		Sbi sbi=new Sbi();
		Icici icici=new Icici();
		Axis axis=new Axis();
		System.out.println("rate of interest in Sbi is :" +sbi.getInterest()+"%");
		System.out.println("rate of interest in Icici is :" +icici.getInterest()+"%");
		System.out.println("rate of interest in Axis is :" +axis.getInterest()+"%");
	}}