package Lab_seasons;
import java.util.*;
/*   Problem Statement 4:
Write a Java program to insert the specified element at the front of a linked list.   */

public class Add_Element_ArrayList {
			public static void main(String[] args) {   // main method
		    LinkedList<String> all = new LinkedList<String>();    // get a link list class
		     	all.add("Rose");
				all.add("Lavender");
				all.add("Lotas");
				all.add("Jasmine");
		     System.out.println("linked list:" + all);    
		     all.offerFirst("Sunflower");
		     System.out.println("front of linked list:" + all);  
	}}
