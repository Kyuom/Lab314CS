import java.util.Scanner;

/*

Program: Assignment15.java          Date: 04-26-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment15 {

	public static void main(String[] args) {
	    int n1 = (int)(Math.random() * 11);  // 0 to 10 for randomly generated number 1
	    int n2 = (int)(Math.random() * 11);  // 0 to 10 for randomly generated number 2
	    int p = (int)(Math.random() * 4);  // 0 to 4 for randomly generated problem
	    
int a1 = n1 + n2; //operation for addition of number 1 and number 2
int a2 = n1 - n2; //operation for subtraction of number 1 and number 2
int a3 = n1 * n2; //operation for multiplication of number 1 and number 2
int a4 = n1 / n2; //operation for division of number 1 and number 2

Scanner myObj = new Scanner (System.in);

if (p == 1) //problem 1 is randomly selected
{
	System.out.print("What is " + n1 + " + " + n2 + " = "); //display question with randomly generated numbers
	int ua = myObj.nextInt(); //User answer input
	if (ua == a1) //If user input is equal to answer
	System.out.print("You got it right! Congratulations!!"); //If user is correct this message is displayed
	else if (ua != a1) //If user input does not equal answer
	System.out.print("You got it wrong!"); //If user is incorrect this message is displayed
}
else if (p == 2) //problem 2 is randomly selected
{
	System.out.print("What is " + n1 + " - " + n2 + " = "); //display question with randomly generated numbers
	int ua = myObj.nextInt(); //User answer input
	if (ua == a2) //If user input is equal to answer
	System.out.print("You got it right! Congratulations!!");  //If user is correct this message is displayed
	else if (ua != a2) //If user input does not equal answer
	System.out.print("You got it wrong!"); //If user is incorrect this message is displayed
}
else if (p == 3) //problem 3 is randomly selected
{
	System.out.print("What is " + n1 + " * " + n2 + " = "); //display question with randomly generated numbers
	int ua = myObj.nextInt(); //User answer input
	if (ua == a3) //If user input is equal to answer
	System.out.print("You got it right! Congratulations!!");  //If user is correct this message is displayed
	else if (ua != a3) //If user input does not equal answer
	System.out.print("You got it wrong!"); //If user is incorrect this message is displayed
}
else if (p == 4) //problem 4 is randomly selected
{
	System.out.print("What is " + n1 + " / " + n2 + " = "); //display question with randomly generated numbers
	int ua = myObj.nextInt(); //User answer input
	if (ua == a4) //If user input is equal to answer
	System.out.print("You got it right! Congratulations!!");  //If user is correct this message is displayed
	else if (ua != a4) //If user input does not equal answer
	System.out.print("You got it wrong!"); //If user is incorrect this message is displayed
}
	}

}
/*


What is 9 + 2 = 4
You got it wrong!


What is 2 * 9 = 18
You got it right! Congratulations!!


*/