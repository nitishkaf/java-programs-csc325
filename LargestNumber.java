package projectone;

/**** 
 * 
 * Program to compares  below three numbers and prints out the largest number.
 * Num1 = 10, Num2=15, Num3=20. 
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
