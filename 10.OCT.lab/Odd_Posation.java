package Lab_seasons;
/*
 Q.3 we need to print the elements of the array which are present in odd positions. This can 
be accomplished by looping through the array and printing the elements of an array by 
incrementing i by 2 till the end of the array is reached.
 */
import java.util.*;

public class Odd_Posation {
	// main method
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // create a scanner class
		System.out.println("Enter array length : ");
		int n= sc.nextInt();
		int arr[]= new int[n]; // create array method
		System.out.println("Enter element of an array");
		for (int i= 0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the odd numbers : ");
		for (int i=1; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}}}