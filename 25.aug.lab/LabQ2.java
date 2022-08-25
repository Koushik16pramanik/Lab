package Activity;

import java.util.Scanner;

// WAP to check a no. is prime no or not
public class LabQ2 {

	public static void main(String[] args) {
		 System.out.println("Enter any number check its Prime or not");
	        Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();
	        int a = 2, x = 0;
	        while (a <= number / 2) {
	            if (number % a == 0) {
	                x++;
	                break;
	            }
	            a++;
	        }
	        if (x == 0) {
	            System.out.println(number + "prime number");
	        } else {
	            System.out.println(number + "not a prime number");

	     }

	}
}
