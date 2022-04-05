/*

Program: Assignment1.java          Date: 3-31-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/

import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) {

		    Scanner myObj = new Scanner(System.in);

		    System.out.println("Enter the diameter of the pizza in inches:");

		    // Numerical input
		    int inches = myObj.nextInt();
			
			// The labor cost of the pizza
			float labor = 0.75f;
			
			// The rent cost of the pizza
			float rent = 1.00f;
			
			// The material cost of the pizza
			float materials = 0.05f*inches*inches;
			
			//cost of pizza
			float cost = labor+rent+materials;
			
		    // Output input by user
		    System.out.println("Diameter of the pizza is: " + inches);
		    System.out.println("The cost of the pizza is: $" + cost);
		  }
		}
