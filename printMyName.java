package projectone;

import java.util.Scanner;
/*
 * Name: Nitish Kafle
 * Project : 1
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 * 
 * This program asks the user for their name and then prints their first and last name.
 * I used scanner utility so that the program can ask and accept input from the user.
 * I also used string before the variable since the value that user enters is going to be a string.
 */

public class printMyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object declared to retrieve user input 
		Scanner printname = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstname = printname.nextLine();	
		//storing the entered string(first name) in variable 'firstname'
		
		System.out.println("Enter your last name: ");
		String lastname = printname.nextLine();		
		//storing the entered string(last name) in variable 'lastname'
		
		
		// OUTPUT AFTER USER ENTERS THE INPUT
		
		//printing the full name
		System.out.println("Your First and Last Name is: "+firstname +" "+lastname);
		
		//printing first name
		System.out.println("Your First Name is: "+firstname);
		
		//printing last name
		System.out.println("Your Last Name is: "+lastname);
		
	}

}
