// Write a Java program to find the value of specified expression. 
package Oerateor;

public class LabQ1 {

	public static void main(String[] args) {
		// initialize a & b & c
		int a = (101+0) / 3;
		double b= 3.0e-6 * 10000000.1;
		boolean c= true && true;
		boolean d= false && true;
		boolean e= (false && false) || (true && true);
		boolean f= (false || false) && (true&&true);
		
		System.out.println("((101+0)/3)->" + a); // logic
		System.out.println("((3.0e-6)*10000000.1)->" + b);
		System.out.println("(true&&false)->" + c);
		System.out.println("(false&&true)->" + d);
		System.out.println("(false&&false)||(true&&true)->" + e);
		System.out.println("(false||false)&&(true&&true)->" + f);
		

	}

}
