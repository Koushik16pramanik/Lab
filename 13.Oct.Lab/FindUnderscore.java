package Lab_seasons;
import java.util.*;
/*
Q.3 Write a Java program to find sequences of lowercase letters joined with a underscore.
 */

public class FindUnderscore {
   public static void main(String[] args) {
	    System.out.println(validate("java_exercises"));	
		System.out.println(validate("Java_Exercises"));	
        }
   public static String validate(String text) {
	   if (text.matches("^[a-z]+_[a-z]+$"))
                return "Found a match!";
       else
                return "Not matched!";
   }}