package Lab_seasons;
//Write a Java program to find the duplicate values of an array of integer values.
public class Array_Integer {
		public static void main(String[] args) {
		
		// Initialize array
	int[] arr = new int[] {5,2,7,7,5};
	System.out.println("Dulicate numbers in given array: ");
	// find out the duplicate numbers
	for(int i=0; i<arr.length; i++) {
		for(int j= i+1; j<arr.length; j++) {
			if(arr[i] == arr[j])
				System.out.println(arr[j]);
		}}}}