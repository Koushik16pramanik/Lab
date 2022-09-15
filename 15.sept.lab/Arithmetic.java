package Lab;
/*
 Q.1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and 
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.
Input Format
test your submission by calling the add method on an Adder object and passing it integer parameters.
 */

class Arithmetic {
    public int add(int num1, int num2) {
        return num1 + num2;
    }} 

class Adder extends Arithmetic {   

    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());    

        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }}
