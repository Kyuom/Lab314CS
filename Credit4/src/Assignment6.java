/*

Program: Assignment6.java          Date: 04-06-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		
	    System.out.print("What is your first name? ");
	    String firstname = myObj.nextLine(); //Recoding user first name input
	    
	    System.out.print("What is your last name? ");
	    String lastname = myObj.nextLine(); //Recording user last name input
	    
	    System.out.print("What grade are you in? ");
	    String grade = myObj.nextLine(); //Recording user grade input
	    
	    System.out.print("What school do you attend? ");
	    String school = myObj.nextLine(); //Recording user school input
	    
	    System.out.print("What is your favourite hobby? ");
	    String hobby = myObj.nextLine(); //Recording user hobby input
	    System.out.println("\r\n");
	    
	    String fullname = firstname + " " + lastname; //Adding first and last name together for the full name
	    
	    		System.out.println("Hello, your name is "+ fullname  + ", " + "you are currently in grade " + grade + " at " + school + ". " + "Your favourite hobby is " + hobby + "."); //Printing dialogue with user input
	
	}

}
/* Screen Dump


What is your first name? Kearmouy
What is your last name? Heng
What grade are you in? 11
What school do you attend? Crescent Heights High School
What is your favourite hobby? sleeping


Hello, your name is Kearmouy Heng, you are currently in grade 11 at Crescent Heights High School. Your favourite hobby is sleeping.


 */