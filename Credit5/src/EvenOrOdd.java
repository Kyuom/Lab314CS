/*

Program: Assignment10.java          Date: 04-11-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		int integer = myObj.nextInt(); //Recording user integer input
		
		int hundredsplace = integer / 100; //hundreds place calculation
		int tensplace = (integer - (hundredsplace * 100)) / 10; //tens place calculation
		int onesplace = integer - (hundredsplace * 100) - (tensplace * 10); //ones place calculation
		
		if (onesplace == 2) {
		      System.out.println("The integer " + integer + " is even");
			} else if (onesplace == 4) {
	        System.out.println("The integer " + integer + " is even");
			} else if (onesplace == 6) {
		        System.out.println("The integer " + integer + " is even");
			} else if (onesplace == 6) {
		        System.out.println("The integer " + integer + " is even");
			} else if (onesplace == 8) {
		        System.out.println("The integer " + integer + " is even");
			} else if (onesplace == 0) {
		        System.out.println("The integer " + integer + " is even");
		    } else {
		      System.out.println("The integer " + integer + " is odd");
		    }

	}

}