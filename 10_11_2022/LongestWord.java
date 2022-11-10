package Lab_seasons;
import java.io.*;
import java.util.*;

// Q.3 Write a Java program to find the longest word in a text file.
public class LongestWord {
	public static void main(String[] args) throws FileNotFoundException  {
      FileReader reader = new FileReader("D:test5.txt");
      Scanner input = new Scanner(reader);
                 
       int longestLenght = 0;
       String word;
       
       //Display the contents of the file
       while(input.hasNext())   {    
           String nextWord = input.next();
           System.out.println(nextWord);           
       }}}  
        