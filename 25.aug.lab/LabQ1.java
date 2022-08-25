package Activity;

import java.util.Scanner;

// WAP to find factorial of any number
public class LabQ1 {

	public static void main(String[] args) 
		{
		      Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the number: ");
		        int num=sc.nextInt();
		        int i=1,a=1;
		        while(i<=num)
		        {
		            a=a*i;
		            i++;
		        }
		        System.out.println("factorial of the number: "+a);  
		     }   
		
	

}
