import java.util.Scanner;

/*

Program: Assignment14.java          Date: 04-26-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment14 {

	public static void main(String[] args) {
Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter age: "); //Prompt user to enter age
		int age = myObj.nextInt(); //User input

		if(age >= 18) //Adult is displayed when 18 or over
		{
			System.out.println("Adult");
		}
		else if(age > 12 && age <= 17) //Teen is displayed when between the ages of 12 and 17
		{
			System.out.println("Teen");
		}
		else if(age >= 11 && age <= 12) //Preteen is displayed when between the ages of 11 and 12
		{
			System.out.println("Preteen");
		}
		else if(age >= 6 && age <= 10) //Child is displayed when between the ages of 6 and 11
		{
			System.out.println("Child");
		}
		else if(age > 0 && age <= 5) //Toddler is displayed when between the ages of 0 and 5
		{
			System.out.println("Toddler");
		}
	}

}
