package Lab_seasons;
/*   Take two numbers x and y. Throw the exception if the two numbers are 
negative else print the 
Product of x and y.
Input Format
The only line of input consists of two integers, x and y.
Constraints ----- -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.    */
import java.util.*;

public class checkTheNumbers {
    // Create a method.
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Take a scanner class 
        System.out.println("Enter 1st Number: ");
        int x = sc.nextInt(); // Taking input 1
        System.out.println("Enter 2nd Number: ");
        int y = sc.nextInt(); //  Taking input 2
        if (x < 0 && y < 0) { // check the condition
            try { // Try block
                throw new Exception("Both numbers are negative"); // Throwing 1st exception
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }} 
        else if (x > 1 && y > 1) { // check the condition
            System.out.println("Product of two numbers is: " + x * y); 
        	} 
        else {
            try {
                throw new Exception("java.lang.Exception: x and y should not be zero."); // Throwing 2nd exception
            }
            catch (Exception e) { 
                System.out.println(e);
            }}}}
