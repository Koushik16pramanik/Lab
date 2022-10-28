package Lab_seasons;

/*  Problem 1. Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print   */

public class CheckOddEvenNumbers { //Main Class
	public static void main(String[] args) throws Exception { //Main Method
		System.out.println("Even: ");
		for(int i=0; i<=100; i++ ) {
			if(i%2 == 0) { //Check even or not 
				System.out.println(i + ","); 
			}}
		Thread.sleep(1000);
		System.out.println();
		System.out.println("Odd: ");
		for(int i=0; i<=100; i++ ) {
			if(i%2 != 0) { //Check Odd or not
				System.out.println(i + ","); 
			}}}}
