import java.util.Scanner;

/*

Program: FinalProject.java          Date: 05-09-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class FinalProject {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter a username: ");
		String UN = myObj.nextLine();
		
		System.out.print("Create a password that is at least 5 characters long: ");
		String P = myObj.nextLine(); //Password variable
		while(P.length() < 5) //Password length is less than 5
		{
			
			System.out.print("Please re-enter a password that is at least 5 characters long: ");
			P = myObj.nextLine();
		}
		
		System.out.print("\r\n" + "Username is: " + UN + "\r\n" + "Password is: " + P + "\r\n");
		
		String a;
	 	do {
		System.out.println("\r\n" + "Enter 5 grades from 0.0-100 to calculate your average: "); //Prompt user to enter their grades or -1 to quit
		System.out.print("Grade 1: ");
		int G1 = myObj.nextInt(); //User input
		System.out.print("Grade 2: ");
		int G2 = myObj.nextInt(); //User input
		System.out.print("Grade 3: ");
		int G3 = myObj.nextInt(); //User input
		System.out.print("Grade 4: ");
		int G4 = myObj.nextInt(); //User input
		System.out.print("Grade 5: ");
		int G5 = myObj.nextInt(); //User input
		System.out.print("\r\n");
		
		double A = (G1 + G2 + G3 + G4 + G5) / 5;
		System.out.print("Your average is: " + A + "\r\n");
		    
		
		if (A >= 80 && A <= 100) //If average is 80-100
		{
			System.out.println("You are a Honours student" + "\r\n");
		}
		else if (A >= 50 && A < 79) //If average is 50-79
		{
			System.out.println("You are a Passing student" + "\r\n");
		}
		else if (A >= 0 && A < 49) //If average is 0-49
		{
			System.out.println("You are a Failing student" + "\r\n");
		}
		else
		{
			System.out.println("Invalid grade" + "\r\n");
		}
	
		System.out.println("Would you like to enter another grade? (Y/N)"); //Prompt the user to enter another grade
		a = myObj.nextLine() + myObj.nextLine(); //User answer input
		
	 	}while (!a.equals("N") && !a.equals("n")); //If user input is not "N" or "n" loop
	 	
	 	System.out.println("Thank you for using our program, have a great day!"); 
	 	
	 	
	}

}
/*
*/