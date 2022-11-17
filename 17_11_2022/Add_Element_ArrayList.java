package Lab_seasons;
import java.util.*;

public class Add_Element_ArrayList {
			public static void main(String[] args) {
		    LinkedList<String> all = new LinkedList<String>();
		     	all.add("Rose");
				all.add("Lavender");
				all.add("Lotas");
				all.add("Jasmine");
		     System.out.println("linked list:" + all);    
		     all.offerFirst("Sunflower");
		     System.out.println("front of linked list:" + all);  
	}}
