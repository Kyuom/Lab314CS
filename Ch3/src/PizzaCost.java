/*

Program: Assignment1.java          Date: 3-31-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/

public class PizzaCost {

	public static void main(String[] args) {
		    
		// The diameter of pizza
		int x = 10;
		int inches = x;
		
		// The labor cost of the pizza
		float labor = 0.75f;
		
		// The rent cost of the pizza
		float rent = 1.00f;
		
		// The material cost of the pizza
		float materials = 0.05f*inches*inches;
		
		//cost of pizza
		float cost = labor+rent+materials;
		
		System.out.println("The diameter of the pizza in inches is: $" +inches
				+"The cost of the pizza is: $" +cost);

	}

}
