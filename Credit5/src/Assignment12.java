import java.util.Scanner;

/*

Program: Assignment12.java          Date: 04-22-2022


Author: Kearmouy Heng
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment12 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		System.out.print("Enter a grade percentage: ");
		int percentage = myObj.nextInt();

		if(percentage >= 90){
			System.out.println("The corresponding letter grade is: A+");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("The corresponding letter grade is: A");
		}else if(percentage < 80 && percentage >= 75){
			System.out.println("The corresponding letter grade is: B+");
		}else if(percentage < 75 && percentage >= 70){
			System.out.println("The corresponding letter grade is: B");
		}else if(percentage < 70 && percentage >= 65){
			System.out.println("The corresponding letter grade is: C+");
		}else if(percentage < 65 && percentage >= 60){
			System.out.println("The corresponding letter grade is: C");
		}else if(percentage < 60 && percentage >= 55){
			System.out.println("The corresponding letter grade is: D+");
		}else if(percentage < 55 && percentage >= 50){
			System.out.println("The corresponding letter grade is: D");
		}else if(percentage < 50){
			System.out.println("The corresponding letter grade is: F");
		}
	}


}
