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
		System.out.print("Enter your grade average point (GPA) or -1 to quit the program: "); //Prompt user to enter their GPA
		float ui = myObj.nextFloat(); //User input

	while(ui > -1.00 && ui <= 4.00)
	{
	      System.out.println(ui);
	      ui++;
	}  
	
	if (ui <= -1)
	{
		System.out.print("Program Quit");
	}
	else if (ui >= 3.8)
	{
		System.out.print("summa cum laude" + "\r\n" + "Would you like to enter another GPA?");
	}
	else if (ui >= 3.65 && ui < 3.8)
	{
		System.out.print("magna cum laude" + "\r\n" + "Would you like to enter another GPA?");
	}
	else if (ui >= 3.5 && ui < 3.65)
	{
		System.out.print("cum laude" + "\r\n" + "Would you like to enter another GPA?");
	}
	else
	{
		System.out.print("Sorry, at this you did not qualify for an honors distinction.");
	}
	
	}
	

}
	
