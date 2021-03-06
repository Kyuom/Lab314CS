/*

Program: Assignment9.java          Date: 04-07-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter an integer: "); //prompting for an integer
		int integer1 = myObj.nextInt(); //recoding user first integer input
		
		System.out.print("Enter a second integer: "); //prompting for a second integer
		int integer2 = myObj.nextInt(); //recording user second integer input
		System.out.print("\r\n");
		
		int answer1 = integer1 / integer2; //integer 1 divided by integer 2 calculation
		int answer2 = integer1 % integer2; //integer 1 modulus by integer 2 calculation

		System.out.print(integer1 + " / " + integer2 + " = " + answer1 + "\r\n" + integer1 + " % " + integer2 + " = " + answer2 + "\r\n\r\n"); //Printing dialogue with user input
		
		int answer3 = integer2 / integer1; //integer 2 divided by integer 1 calculation
		int answer4 = integer2 % integer1; //integer 2 modulus by integer 1 calculation
		
		System.out.print(integer2 + " / " + integer1 + " = " + answer3 + "\r\n" + integer2 + " % " + integer1 + " = " + answer4); //Printing dialogue with user input
	
	}

}
/* Screen Dump


Enter an integer: 14
Enter a second integer: 4

14 / 4 = 3
14 % 4 = 2

4 / 14 = 0
4 % 14 = 4


 */