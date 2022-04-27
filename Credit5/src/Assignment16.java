import java.util.Scanner;

/*

Program: Assignment16.java          Date: 04-27-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment16 {

	public static void main(String[] args) {
		int cn = (int)(Math.random() * 21);  // 0 to 20 for randomly generated computer number
		
		Scanner myObj = new Scanner (System.in);
		System.out.print("Enter a number between 1 and 20: "); //Prompt user to enter random number between 1 and 20
		int n = myObj.nextInt(); //User number input
		
		System.out.println("Computer’s Number is: " + cn + "\r\n" + "Player’s Number is: " + n); //Display computer random number and users random number

		if (cn == n) //If the computer random number and user random number is the same
		{
			System.out.print("You Won!"); //Display "You won!" if computer random number and users random number are equal
		}
		else //If the computer number and user random number are not the same3
		{
			System.out.print("Better luck next time."); //Display "Better luck next time" is computer random number and users random number are not equal
		}
	}

}
/*


Enter a number between 1 and 20: 8
Computer’s Number is: 15
Player’s Number is: 8
Better luck next time.

Enter a number between 1 and 20: 3
Computer’s Number is: 2
Player’s Number is: 3
Better luck next time.

Enter a number between 1 and 20: 6
Computer’s Number is: 6
Player’s Number is: 6
You Won!


*/