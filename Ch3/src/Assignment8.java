/*

Program: Assignment8.java          Date: 04-07-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter a two digit number ");
		int digit2 = myObj.nextInt();
		System.out.print("\r\n");

		int tensplace2 = digit2 / 10;
		int onesplace2 = digit2 - (tensplace2 * 10);
		
		System.out.println("The tens-place digit is: " + tensplace2);
		System.out.println("The ones-place digit is: " + onesplace2);
		System.out.println("\r\n");
		
		System.out.print("Enter a three digit number: ");
		int digit3 = myObj.nextInt();
		System.out.print("\r\n");
		
		int hundredsplace3 = digit3 / 100;
		int tensplace3 = (digit3 - (hundredsplace3 * 100)) / 10;
		int onesplace3 = digit3 - (hundredsplace3 * 100) - (tensplace3 * 10);
		
		System.out.println("The hundreds-place digit is: " + hundredsplace3);
		System.out.println("The tens-place digit is: " + tensplace3);
		System.out.println("The ones-place digit is: " + onesplace3);
		System.out.println("\r\n");
	}

}
