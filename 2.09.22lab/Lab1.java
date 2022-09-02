package Activity;
import java.util.*;
/*
   You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the 
method.
divisorSum method just takes an integer as input and return the sum of all its divisors. For 
example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at 
most 1000.
Read the partially completed code in the editor and complete it. You just need to write the 
MyCalculator class only. Your class shouldn't be public.
*/


		
		public class Lab1{
			void divisorsum(int n) {
				int sum=0;
				for(int i=1; i<n; i++) {
					if (n%i==0) {
						sum=sum+i;
						
					}
				}
				System.out.println("The sum of divisor :"+sum);
		}
			public static void main(String[] args) {
				Scanner ps=new Scanner(System.in);
				int n=ps.nextInt();
				Lab1 adv=new Lab1();
				adv.divisorsum(n);
			}
	

}
