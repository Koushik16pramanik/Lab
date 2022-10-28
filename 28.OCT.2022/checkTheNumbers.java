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

class Negativenumbers1  {
    // Create a method.
    public long power(int x, int y) throws Exception  {  // given data
        if(x == 0 && y == 0)
            throw new Exception("x and y should not be zero.");  // given data
        else if(x <= -20 || y <= 20)
            throw new Exception(" java.lang.exception:x and y should not be zero.");  // given data
        else
            return (long)(Math.pow(x,y));
    		}}
public class checkTheNumbers {    // main method
    public static final Negativenumbers1 my_calculator = new Negativenumbers1();
    public static final Scanner in = new Scanner(System.in);    // use scanner class
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            try {
                System.out.println(my_calculator.power(n, p));
            }
            catch (Exception e) {
                System.out.println(e);
            }}}}