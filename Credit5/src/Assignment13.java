import java.util.Scanner;

/*

Program: Assignment13.java          Date: 04-25-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment13 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		System.out.print("Enter the number of copies to be printed: ");
		int copies = myObj.nextInt();

		if(copies >= 0 && copies >=99)
		{
			System.out.print("Price per copy is: $0.30");
		}
		else if(copies >= 100 && copies >=499)
		{
			System.out.print("Price per copy is: $0.28");
		}
		else if(copies >= 500 && copies >=749)
		{
			System.out.print("Price per copy is: $0.27");
		}
		else if(copies >= 750 && copies >=1000)
		{
			System.out.print("Price per copy is: $0.26");
		}
		else if(copies >1000)
		{
			System.out.print("Price per copy is: $0.25");
		}

	}

}
