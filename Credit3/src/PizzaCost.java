/*

Program: Assignment4.java          Date: 04-01-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/

import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) {

		    Scanner myObj = new Scanner(System.in);

		    System.out.print("Enter the diameter of the pizza in inches: ");
		    int inches = myObj.nextInt(); // Recording user pizza diameter input
		    System.out.println("\r\n");
		    
			float labor = 0.75f; // The labor cost of the pizza
			float rent = 1.00f; // The rent cost of the pizza
			float materials = 0.05f * inches * inches; // The material cost calculation of the pizza
			float cost = labor + rent + materials; //The total cost calculation of the pizza
		    System.out.println("The cost of the pizza is: $" + cost); // Output input by user
		  }
		}
/* Screen Dump


Enter the diameter of the pizza in inches: 10


The cost of the pizza is: $6.75



 */