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
		
		System.out.println("Please enter a grade percentage: "); //record user grade

		int grade = myObj.nextInt(); //Recording user input

		switch (grade) 
{
	case 1:
		System.out.println("A+");
		break;
	case 2:
		System.out.println("A");
		break;
	case 3:
		System.out.println("B+");
		break;
	case 4:
		System.out.println("B");
		break;
	case 5:
		System.out.println("C+");
		break;
	case 6:
		System.out.println("C");
		break;
	case 7:
		System.out.println("D+");
		break;
	case 8:
		System.out.println("D");
		break;
	case 9:
		System.out.println("F");
		break;
}
	}


}
