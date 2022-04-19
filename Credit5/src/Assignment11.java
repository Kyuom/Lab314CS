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
		
int firstdig = integer / 10;
int seconddig = integer % 10;

System.out.print("First digit: " + firstdig + " Second digit: " + seconddig);

int max = 0;
int min = 0;
	
if(firstdig > seconddig); //85
{
max = firstdig;
min = seconddig;

System.out.print("Maximum: " + max + " Minimum: " + min);

}
else //58
{
max = seconddig;
min = firstdig;

System.out.print("Maximum: " + max + " Minimum: " + min);

}

}
	
}