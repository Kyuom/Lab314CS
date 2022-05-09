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
		
		String a;
	 	do {
		System.out.print("Enter your grade average point (GPA) or -1 to quit the program: " + "\r\n"); //Prompt user to enter their GPA
		double ui = myObj.nextDouble(); //User input
		System.out.print("\r\n");
		
		while (ui < -1) //If the user input is less than -1
		{
		    System.out.println("Please re-enter GPA from 0.0-4.0 or -1 to quit program: ");
		    ui = myObj.nextDouble(); // User input
		    System.out.print("\r\n");
		}
		while (ui > 4.0) //If the user input is greater than 4
		{
		    System.out.println("Please re-enter GPA from 0.0-4.0 or -1 to quit program: ");
		    ui = myObj.nextDouble(); //User input
		    System.out.print("\r\n");
		}
		
		if (ui == -1) //If user input is -1 print "Program quit"
		{
			System.out.println("Program quit" + "\r\n");
		}
		else if (ui >= 3.8 && ui <= 4.0) //If user input is in between 3.8-4.0 print "Summa cum laude"
		{
			System.out.println("Summa cum laude" + "\r\n");
		}
		else if (ui >= 3.65 && ui < 3.8) //If user input is in between 3.65-3.8 print 3.65-3.8 print "Magna cum laude"
		{
			System.out.println("Magna cum laude" + "\r\n");
		}
		else if (ui >= 3.5 && ui < 3.65) //If user input is between 3.5-3.65 print "Cum laude"
		{
			System.out.println("Cum laude" + "\r\n");
		}
		else //If user input is not any of the above print "Sorry, at this you did not qualify for an honors distinction."
		{
			System.out.println("Sorry, at this you did not qualify for an honors distinction.");
		}
	
		System.out.println("Would you like to enter another GPA? (Y/N)"); //Prompt the user to enter another GPA
		a = myObj.nextLine() + myObj.nextLine(); //User answer input
		System.out.print("\r\n");
		
	 	}while (!a.equals("N") && !a.equals("n")); //If user input is not "N" or "n" loop
	
	 	System.out.println("Thank you for using our program, have a great day!"); 
}

}
/*


Enter your grade average point (GPA) or -1 to quit the program: 
5

Please re-enter GPA from 0.0-4.0 or -1 to quit program: 
4

Summa cum laude

Would you like to enter another GPA? (Y/N)
Y

Enter your grade average point (GPA) or -1 to quit the program: 
3.7

Magna cum laude

Would you like to enter another GPA? (Y/N)
y

Enter your grade average point (GPA) or -1 to quit the program: 
3.5

Cum laude

Would you like to enter another GPA? (Y/N)
Y

Enter your grade average point (GPA) or -1 to quit the program: 
2

Sorry, at this you did not qualify for an honors distinction.
Would you like to enter another GPA? (Y/N)
y

Enter your grade average point (GPA) or -1 to quit the program: 
-1

Program quit

Would you like to enter another GPA? (Y/N)
N

Thank you for using our program, have a great day!


*/