package Lab_seasons;
import java.util.*;
/*   Problem Statement 3: 
  
  Write a Java program to extract a portion of an array list.     */

public class ExtractPortion {
		public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
			
		System.out.println("Array List" + al);
		List<String> al1= al.subList(0, 3);
		System.out.println("extract a portion of an array list "+ al1);
	}}
