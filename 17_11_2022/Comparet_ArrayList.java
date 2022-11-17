package Lab_seasons;
import java.util.*;
/*    Problem Statement 4:
	  Write a Java program to compare two array lists.    */

public class Comparet_ArrayList {
			public static void main(String[] args) {  // main method
			ArrayList<String> al = new ArrayList<String>();   // Creating array list
			al.add("Red");
			al.add("Green");
			al.add("Black");
			al.add("White");
			al.add("Pink");
			
			ArrayList<String> al1 = new ArrayList<String>();  // list 2
			al1.add("Red");
			al1.add("Green");
			al1.add("Black");
			al1.add("Pink");
			
			ArrayList<String> all = new ArrayList<String>();  // list 3
	        for (String e : al)
	        all.add(al1.contains(e) ? "Yes" : "No"); 
	        System.out.println(all);
	}}
