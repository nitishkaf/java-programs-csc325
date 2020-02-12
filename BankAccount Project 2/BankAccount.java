/*
 * Name: Nitish Kafle
 * Program: Bank Account (Project 2)
 * Class: CSC325
 * Spring 2020
 * 
 * This program will include:
 * 1. instance variables
 * 2. a constructor
 * 3. accessor and mutator methods
 * 4. parameter and local variables
 */
package bankAccount;

import java.util.Scanner;

class BankAccount{	//This class will include variables for global use.
	String acctHolderFirstName;
	String acctHolderLastName;
	double acctBalance;
	String acctType;
	Scanner sc = new Scanner(System.in);	//asking for user input
	
	
	/*
	 * Creating a default constructor taking the following values:
	 * 1. Initializing account Balance
	 * 2. Setting the account Type
	 * 3. Calling getAccountInfo();
	 */
	
	BankAccount()	//Default Constructor
	{
		this.acctBalance = 895;
		this.acctType = "Saving";
		getAccountInfo();
		
		/*
		 * For RonaldoAccount:
		 * 
		 * this.acctBalance = 0;
		 * this.acctType = "Checking";
		 * getAccountInfo();
		 */
	}

	/*
	 * Creating an overloaded Constructor that takes following parameters:
	 * 1. firstName
	 * 2. lastName
	 * 3. balance
	 * 4. Type
	 * 
	 * These method will set assign the previously assigned variables values to the new ones.
	 */
	BankAccount(String firstName, String lastName, double balance , String Type)	//Overloaded Constructor
	{
		this.acctHolderFirstName = firstName;
		this.acctHolderLastName = lastName;
		this.acctBalance = balance;
		this.acctType = Type;
	}
	
	void getAccountInfo(){	//This method will display Account holder personal and banking details.

		System.out.println("Enter Your First Name");
		acctHolderFirstName = sc.nextLine();
		System.out.println("Enter Your Last Name");
		acctHolderLastName = sc.nextLine();
		System.out.println("Account Type [Checking/Saving]");
		acctType = sc.nextLine();
	}
	
	void deposit()	//This method will ask user to enter the deposit amount then add it to the account.
	{
		System.out.println("Enter the Amount you want to Deposit: ");
		double deposit = sc.nextDouble();
		this.acctBalance = this.acctBalance + deposit;
	}
	

	void displayBalance()	//This method will display the account holder's updated information after deposit.
	{
		System.out.println("First Name = " + this.acctHolderFirstName);
		System.out.println("Last Name = " + this.acctHolderLastName);
		System.out.println("Account Type = " + this.acctType);
		System.out.println("Balance = $"+ this.acctBalance);
	}
}