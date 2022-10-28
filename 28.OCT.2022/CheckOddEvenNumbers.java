package Lab_seasons;

/*  Problem 1. Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print   */

public class CheckOddEvenNumbers {  // main method
		public static void main(String[] args) {
			Runnable r1 = new Runnable1();
			Runnable r2 = new Runnable2();
			Thread t1 = new Thread(r1);
			Thread t2 = new Thread(r2);
			t1.start();
			t2.start();
		}}
	class Runnable1 implements Runnable {   // implement class1
		public void run() {
			for (int i = 1; i <= 11; i += 2) {
				System.out.println(i);
			}}}
	class Runnable2 implements Runnable {   // implement class2
		public void run() {
			for (int i = 0; i < 11; i += 2) {
				System.out.println(i);
			}}}