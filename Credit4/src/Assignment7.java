/*

Program: Assignment7.java          Date: 04-06-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter the change in cents: ");
		int cents = myObj.nextInt(); //Recording user cents input
		System.out.println("\r\n");

		int quarters = cents / 25; //The quarter amount calculation
		int dimes = (cents - quarters * 25) / 10; //The dime amount calculation
		int nickels = (cents - quarters * 25 - dimes * 10) / 5; //The nickel amount calculation
		int pennies = (cents - quarters * 25 - dimes * 10 - nickels * 5) / 1; //The penny amount calculation
				
		System.out.println("The minimum number of coins is: " + "\r\n" + "Quarters: " + quarters + "\r\n" + "Dimes: " + dimes + "\r\n" + "Nickels: " + nickels + "\r\n" + "Pennies: " + pennies); //The amount of coins according to user input
	
	}

}
/* Screen Dump


Enter the change in cents: 212


The minimum number of coins is: 
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 2


 */