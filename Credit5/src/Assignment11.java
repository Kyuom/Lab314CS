import java.util.Scanner;

/*

Program: Assignment11.java          Date: 04-14-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment11 {

	public static void main(String[] args) {
Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter a three digit integer: ");
		int integer = myObj.nextInt(); //Recording user integer input
		
integer = integer % 10;
integer = integer / 10;
	}

}