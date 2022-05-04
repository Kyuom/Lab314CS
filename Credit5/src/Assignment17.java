import java.util.Scanner;

/*

Program: Assignment17.java          Date: 04-27-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment17 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		do {
		System.out.print("Enter your grade average point (GPA) or -1 to quit the program: " + "\r\n"); //Prompt user to enter their GPA
		double ui = myObj.nextDouble(); //User input
		{
		while (ui < -1)
		{
		    System.out.println("Please re-enter GPA from 0.0-4.0 or -1 to quit program: ");
		    ui = myObj.nextDouble();
		}
		while (ui > 4.0)
		{
		    System.out.println("Please re-enter GPA from 0.0-4.0 or -1 to quit program: ");
		    ui = myObj.nextDouble();
		}
		
		if (ui == -1)
		{
			System.out.println("Program Quit");
		}
		
		while (ui != -1)
		{
		if (ui >= 3.8 && ui <= 4.0)
		{
			System.out.println("Summa cum laude");
		}
		else if (ui >= 3.65 && ui < 3.8)
		{
			System.out.println("Magna cum laude");
		}
		else if (ui >= 3.5 && ui < 3.65)
		{
			System.out.println("Cum laude");
		}
		else
		{
			System.out.println("Sorry, at this you did not qualify for an honors distinction.");
		}
		break;
		}
		
	
	System.out.println("Would you like to enter another GPA? (Y/N)");
	String a = myObj.next();
		}while(a == "Y"); 
		
	System.out.println("Thank you for using our program, have a great day!");
		
		}
	}
	
		