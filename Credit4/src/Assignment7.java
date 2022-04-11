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
		int cents = myObj.nextInt();
		System.out.println("\r\n");

		int quarters = cents / 25;	
		int dimes = (cents - quarters * 25) / 10;
		int nickels = (cents - quarters * 25 - dimes * 10) / 5;
		int pennies = (cents - quarters * 25 - dimes * 10 - nickels * 5) / 1;
				
		System.out.println("The minimum number of coins is: ");
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
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