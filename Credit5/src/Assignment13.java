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
		System.out.print("Enter the number of copies to be printed: "); //Prompt user to enter amount of copies
		int copies = myObj.nextInt(); //User copies input

		double cost1 = copies * 0.30; //Total cost of copies between 0 and 99
		double cost2 = copies * 0.28; //Total cost of copies between 100 and 499
		double cost3 = copies * 0.27; //Total cost of copies between 500 and 749
		double cost4 = copies * 0.26; //Total cost of copies between 750 and 1000
		double cost5 = copies * 0.25; //Total cost of copies about 1000
		
		
		if(copies >= 0 && copies <=99) //Calculations for copies between 0 and 99
		{
			System.out.print("Price per copy is: $0.30" + "\r\n" + "Total cost is: " + cost1); //Print cost per sheet and total cost
		}
		else if(copies >= 100 && copies <=499) //Calculations for copies between 100 and 499
		{
			System.out.print("Price per copy is: $0.28" + "\r\n" + "Total cost is: " + cost2); //Print cost per sheet and total cost
		}
		else if(copies >= 500 && copies <=749) //Calculations for copies between 500 and 749
		{
			System.out.print("Price per copy is: $0.27" + "\r\n" + "Total cost is: " + cost3); //Print cost per sheet and total cost
		}
		else if(copies >= 750 && copies <=1000) //Calculations for copies between 750 and 1000
		{
			System.out.print("Price per copy is: $0.26" + "\r\n" + "Total cost is: " + cost4); //Print cost per sheet and total cost
		}
		else if(copies >1000) //Calculations for copies above 1000
		{
			System.out.print("Price per copy is: $0.25" + "\r\n" + "Total cost is: " + cost5); //Print cost per sheet and total cost
		}

	}

}
/*


Enter the number of copies to be printed: 1001
Price per copy is: $0.25
Total cost is: 250.25


*/