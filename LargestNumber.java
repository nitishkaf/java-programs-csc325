package projectone;

/*
 * Name: Nitish Kafle
 * Project : 1
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 * 
 * This program compares the three numbers and prints out the largest number.
 * I used int which is 32-bit on this program because it can hold -2147483648 to 2147483647 numbers.
 * if...else statement is used to check the condition and if the condition is true, the program processes the output
 */
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assigning Values to the Variables
		int Num1 = 10;
		int Num2 = 15;
		int Num3 = 20;
		
		//Checking condition using if_else statement
		if (Num1>=Num2 && Num1>=Num3) {
			System.out.println(Num1);	//prints 10 if it satisfies the condition
		}
		else if (Num2>=Num1 && Num1>=Num3) {
			System.out.println(Num2);	//prints 15 if it satisfies the condition
		}
		else {
			System.out.println(Num3);	//prints 20 if it satisfies the condition
		}
	}
	
	/*** OUTPUT
	 * 20 because 20 is greater than 15 and 10.
	 * PRINTS 20 since Num3=20 and it satisfies the conditions that are given.
	 */

}
