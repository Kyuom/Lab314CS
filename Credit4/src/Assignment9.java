/*

Program: Assignment9.java          Date: 04-07-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		int integer1 = myObj.nextInt();
		
		System.out.print("Enter a second integer: ");
		int integer2 = myObj.nextInt();
		System.out.print("\r\n");
		
		int answer1 = integer1 / integer2;
		int answer2 = integer1 % integer2;

		System.out.print(integer1
			+" / "
			+integer2
			+" = "
			+answer1);
		System.out.print("\r\n");

		System.out.print(integer1
			+" % "
			+integer2
			+" = "
			+answer2);
		System.out.print("\r\n\r\n");
		
		int answer3 = integer2 / integer1;
		int answer4 = integer2 % integer1;
		
		System.out.print(integer2
			+" / "
			+integer1
			+" = "
			+answer3);
		System.out.print("\r\n");
		
		System.out.print(integer2
				+" % "
				+integer1
				+" = "
				+answer4);
	}

}
/* Screen Dump


Enter an integer: 14
Enter a second integer: 4

14 / 4 = 3
14 % 4 = 2

4 / 14 = 0
4 % 14 = 4


 */