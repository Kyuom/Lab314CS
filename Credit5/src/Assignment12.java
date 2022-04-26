import java.util.Scanner;

/*

Program: Assignment12.java          Date: 04-22-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment12 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter a grade percentage: "); //Prompt user to enter grade percentage
		int percentage = myObj.nextInt(); //User input

		if(percentage >= 90) //A+ for grades that are 90 and above
		{
			System.out.println("The corresponding letter grade is: A+");
		}
		else if(percentage < 90 && percentage >= 80) //A for grades that are between 80 and 90
		{
			System.out.println("The corresponding letter grade is: A");
		}
		else if(percentage < 80 && percentage >= 75) //B+ for grades that are between 75 and 80
		{
			System.out.println("The corresponding letter grade is: B+");
		}
		else if(percentage < 75 && percentage >= 70) //B for grades that are between 70 and 75
		{
			System.out.println("The corresponding letter grade is: B");
		}
		else if(percentage < 70 && percentage >= 65) //C+ for grades that are between 70 and 65
		{
			System.out.println("The corresponding letter grade is: C+");
		}
		else if(percentage < 65 && percentage >= 60) //C for grades that are between 65 and 60
		{
			System.out.println("The corresponding letter grade is: C");
		}
		else if(percentage < 60 && percentage >= 55) //D+ for grades that are between 60 and 55
		{
			System.out.println("The corresponding letter grade is: D+");
		}
		else if(percentage < 55 && percentage >= 50) //D for grades that are between 55 and 50
		{
			System.out.println("The corresponding letter grade is: D");
		}
		else if(percentage < 50) //F for grades lower than 50
		{
			System.out.println("The corresponding letter grade is: F");
		}
	}


}
/*


Enter a grade percentage: 75
The corresponding letter grade is: B+


*/
