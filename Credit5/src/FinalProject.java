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
		String P = myObj.nextLine();
		while(P.length() < 5) 
		{
			
			System.out.print("Please re-enter a password that is at least 5 characters long: ");
			P = myObj.nextLine();
		}
		
		System.out.print("\r\n" + "Username is: " + UN + "\r\n" + "Password is: " + P);
		
		String a;
	 	do {
		System.out.print("\r\n" + "Enter your grades from 0.0-100 to calculate your average or -1 to quit the program: " + "\r\n"); //Prompt user to enter their grades or -1 to quit
		int G1 = myObj.nextInt(); //User input
		int G2 = myObj.nextInt(); //User input
		int G3 = myObj.nextInt(); //User input
		int G4 = myObj.nextInt(); //User input
		System.out.print("\r\n");
		
		while (G1 < -1 && G2 < -1 && G3 < -1 && G4 < -1) //If the user input is less than -1
		{
		    System.out.println("Please re-enter grades from 0.0-100 or -1 to quit program: ");
		    G1 = myObj.nextInt(); //User input
		    G2 = myObj.nextInt(); //User input
			G3 = myObj.nextInt(); //User input
			G4 = myObj.nextInt(); //User input
		    System.out.print("\r\n");
		}
		while (G1 > 100 && G2 > 100 && G3 > 100 && G4 > 100) //If the user input is greater than 4
		{
		    System.out.println("Please re-enter grades from 0.0-100 or -1 to quit program: ");
		    G1 = myObj.nextInt(); //User input
		    G2 = myObj.nextInt(); //User input
			G3 = myObj.nextInt(); //User input
			G4 = myObj.nextInt(); //User input
		    System.out.print("\r\n");
		}
		
		if (G1 == -1 && G2 == -1 && G3 == -1 && G4 == -1) //If user input is -1 print "Program quit"
		{
			System.out.println("Program quit" + "\r\n");
		}
		
		double A = (G1 + G2 + G3 + G4) / 4;
		System.out.print("Your average is: " + A);
		    
		
		if (A >= 80 && ui <= 100) //If average is 80-100
		{
			System.out.println("Honours Student" + "\r\n");
		}
		else if (A >= 50 && A < 79) //If average is 50-79
		{
			System.out.println("Passing student" + "\r\n");
		}
		else (A >= 0 && A < 49) //If average is 0-49
		{
			System.out.println("Failing Student" + "\r\n");
		}
	
		System.out.println("Would you like to enter another grade? (Y/N)"); //Prompt the user to enter another grade
		a = myObj.nextLine() + myObj.nextLine(); //User answer input
		System.out.print("\r\n");
		
	 	}while (!a.equals("N") && !a.equals("n")); //If user input is not "N" or "n" loop
	
	 	System.out.println("Thank you for using our program, have a great day!"); 
	}

}
/*
*/