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
		
		if (integer % 2 == 0) //integer modulus returns the division remainder of 2
			{
		      System.out.println("\r\n" + "The integer " + integer + " is even."); //If integer has a remainder of 2, it is printed out as even
		    } else 
		    {
		      System.out.println("\r\n" + "The integer " + integer + " is odd."); //If integer doesb't have a remainder of 2, it is printed out as odd
		    }

	}

}
/* Screen Dump


Enter an integer: 28

The integer 28 is even.

Enter an integer: 2049

The integer 2049 is odd.

Enter an integer: -236

The integer -236 is even.


 */