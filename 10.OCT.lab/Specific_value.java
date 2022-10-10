package Lab_seasons;
// Q.1 Write a Java program to test if an array contains a specific value.
class Specific_value {
	public static void main(String[] args) {
		int [] num= {1789,2035,1899,1456,2013};
		int toFind= 2013;
		boolean found= false;
		for (int n : num) {
			if (n == toFind) {
				found = true;
				break;
			}}
 if (found)
	 System.out.println(toFind + " is found. ");
 else
	 System.out.println(toFind + "is not found. ");
	}}