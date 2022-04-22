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
		
int firstdig = integer / 100;
int seconddig = (integer % 100) / 10;
int thirddig = (integer % 100) % 10;

System.out.println("First digit: " + firstdig + " Second digit: " + seconddig + " Third digit: " + thirddig);

int max = 0;
int min = 0;

	  if ((seconddig > firstdig) && (thirddig > seconddig) && (thirddig > firstdig)) // the third digit is the greatest and the first digit is the smallest
	  {
		  max = thirddig;
		  min = firstdig;
	  }
	  else if ((seconddig < firstdig) && (thirddig > seconddig) && (thirddig > firstdig)) // the third digit is the greatest and the second digit is the smallest
	  {
		  max = thirddig;
		  min = seconddig;
	  }
	  else if ((seconddig > firstdig) && (seconddig > thirddig) && (firstdig < thirddig)) // the second digit is the greatest and the first digit is the smallest
	  {
	      max = seconddig;
	      min = firstdig;
	  }
	  else if ((seconddig > firstdig) && (seconddig > thirddig) && (firstdig > thirddig)) // the second digit is the greatest and the third digit is the smallest
	  {
		  max = seconddig;
		  min = thirddig;
	  }
	  else if ((firstdig > seconddig) && (firstdig > thirddig) && (seconddig > thirddig)) // the first digit is the greatest and the third digit is the smallest
	  {
		  max = firstdig;
		  min = thirddig;
	  }
	  else // the first digit is the greatest and the second digit is the smallest
	  {
		  max = firstdig;
		  min = seconddig;
	  }
	  
	  int sum = firstdig + seconddig + thirddig;
	  int prod = firstdig * seconddig * thirddig;
	  int avg = (firstdig + seconddig + thirddig) / 3;
	  
System.out.println("The largest of the three digits is: " + max + "\r\n" + "The smallest of the three digits is: " + min + "\r\n" + "The sum of the three digits is: "
		+ sum + "\r\n" + "The product of the three digits is: " + prod + "\r\n" + "The average of the three digits is: " + avg);
	}

}
/*
Enter a three digit integer: 579
First digit: 5 Second digit: 7 Third digit: 9
The largest of the three digits is: 9
The smallest of the three digits is: 5
The sum of the three digits is: 21
The product of the three digits is: 315
The average of the three digits is: 7

Enter a three digit integer: 931
First digit: 9 Second digit: 3 Third digit: 1
The largest of the three digits is: 9
The smallest of the three digits is: 1
The sum of the three digits is: 13
The product of the three digits is: 27
The average of the three digits is: 4

Enter a three digit integer: 486
First digit: 4 Second digit: 8 Third digit: 6
The largest of the three digits is: 8
The smallest of the three digits is: 4
The sum of the three digits is: 18
The product of the three digits is: 192
The average of the three digits is: 6

Enter a three digit integer: 452
First digit: 4 Second digit: 5 Third digit: 2
The largest of the three digits is: 5
The smallest of the three digits is: 2
The sum of the three digits is: 11
The product of the three digits is: 40
The average of the three digits is: 3

Enter a three digit integer: 536
First digit: 5 Second digit: 3 Third digit: 6
The largest of the three digits is: 6
The smallest of the three digits is: 3
The sum of the three digits is: 14
The product of the three digits is: 90
The average of the three digits is: 4

*/ 