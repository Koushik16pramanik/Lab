package Lab_seasons;
//1.write a java program to print sum of odd numbers up to N?


import java.util.Scanner;
       public class Lab_Q1 {
	
	     public static void main(String args[]) {
	        int x;
	        int i;
	        int sum = 0;
	        
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a number");
	        x = in.nextInt();
	        for(i = 0; i <= x; i++){
	            if((i%2) == 1){
	                sum += i;
	        }}
	        
	        System.out.print("Sum of all odd numbers between 0 to " + x + " = " + sum);
	        }}