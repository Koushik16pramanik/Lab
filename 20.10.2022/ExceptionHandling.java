package Lab_seasons;
import java.util.*;
/* Q.2 Wite a program in Java to create a file in Java using Exception Handling.   */
class InvalidAgeException  extends Exception  {  
 public InvalidAgeException (String str)  {  
     // calling the constructor of parent Exception  
     super(str);  
 	}}  
//use custom exception
public class ExceptionHandling  {  
 // To check the age  
 static void validate (int age) throws InvalidAgeException{    
    if(age < 20){  
     // throw an object of user defined exception  
     throw new InvalidAgeException("age is not valid to vote");    
    }  
    else {   
     System.out.println("You are a Voter");   
     }}
 // main method  
 public static void main(String args[])  {  
	 ExceptionHandling c= new ExceptionHandling();
	 // use scanner class
	 Scanner s= new Scanner(System.in);
	 System.out.println("Enter your age");
	 int age =s.nextInt();
	 try {
		validate(age);} 
	 catch (InvalidAgeException e) {
		e.printStackTrace();
	}}}