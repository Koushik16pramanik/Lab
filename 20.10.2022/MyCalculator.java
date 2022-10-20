package Lab_seasons;
import java.util.*;

/*  Q.4  Create a class MyCalculator which consists of a single method long power(int, int). 
This method takes two integers, n and p, as parameters and finds n^p . If either n or 
p is negative, then the method must throw an exception which says "n or p should 
not be negative.". Also, if both n and p are zero, then the method must throw an 
exception which says "n and p should not be zero."
Input Format
Each line of the input contains two integers, n and p.
Constraints
-10 < n < 10
-10 < p < 10
Output Format
Each line of the output contains the result, if both n and p are positive. If either n or p 
is negative, the output contains "n and p should be non-negative". If both n and p are 
zero, the output contains "n and p should not be zero.".
Sample TestCase 1
Input
12 2
2 10
0 0
2 -1
Output
144
1024
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.  */

class Solution  {
    // Create a method.
    public long power(int n, int p) throws Exception  {  // given data
        if(n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");  // given data
        else if(n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");  // given data
        else
            return (long)(Math.pow(n,p));
    		}}
public class MyCalculator {    // main method
    public static final Solution my_calculator = new Solution();
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