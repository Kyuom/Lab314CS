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

{
	  if (firstdig < seconddig) 
	  {
	      System.out.println("Maximum " + max + " Minimum " + min);
	  }
	  else if (seconddig < firstdig) 
	  {
	      System.out.println("Maximum " + max + " Minimum " + min);
	  } 
	  else 
	  {
	      System.out.println("Maximum " + max + " Minimum " + min);
	
	  }
}
/*
if(firstdig > seconddig); //85
{
max = firstdig;
min = seconddig;
}
else
{
max = seconddig;
min = firstdig;

}
*/ 

if((seconddig > firstdig) && (thirddig > seconddig) && (firstdig < thirddig));

System.out.print("Maximum: " + Math.max(firstdig, thirddig)  + " Minimum: " + Math.min(firstdig, thirddig));
	
}
}