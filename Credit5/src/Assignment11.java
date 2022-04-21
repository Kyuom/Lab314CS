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
	  
	  int sum = max + min;
	  int prod = max * min;
	  int avg = (firstdig + seconddig + thirddig) / 3;
	  
System.out.println("The largest of the three digits is: " + "\r\n" + max + " The smallest of the three digits is: " + min + " The sum of the three digits is" + sum 
		+ " The product of the three digits is" + prod + " The average of the three digits is" + avg);
	}

}
/*
Enter a three digit integer: 579
First digit: 5 Second digit: 7 Third digit: 9
Maximum: 9 Minimum: 5

Enter a three digit integer: 931
First digit: 9 Second digit: 3 Third digit: 1
Maximum: 9 Minimum: 1

Enter a three digit integer: 486
First digit: 4 Second digit: 8 Third digit: 6
Maximum: 8 Minimum: 4

Enter a three digit integer: 452
First digit: 4 Second digit: 5 Third digit: 2
Maximum: 5 Minimum: 2

Enter a three digit integer: 536
First digit: 5 Second digit: 3 Third digit: 6
Maximum: 6 Minimum: 3

*/ 