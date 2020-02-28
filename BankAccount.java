/*
 * Name: Nitish Kafle
 * Program: Bank Account (Project 3)
 * Class: CSC325
 * Spring 2020
 * 
 * This program will include:
 * 1. constructor setAccountPassWord() - asks user for pin and returns the pin
 * 2. initializing balance for both saving and checking
 * 3. withdraw method to ask and check if pin satisfies condition
 */
package bankAccount;

import java.util.Scanner;

public class BankAccount{
	
	
	//assigning static variables for global use
	static String acctHolderFirstName;
	static String acctHolderLastName;
	static int checkingBalance=0;
    static  int savingBalance=0;
    static int test;
	String acctType;
	static Scanner sc = new Scanner(System.in);	//asking for user input
	BankAccount()	//Default Constructor
	{
		this.checkingBalance = 0;
		this.acctType = "Checking";
		this.savingBalance = 0;
		this.acctType = "Saving";
		getAccountInfo();
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
	BankAccount(String firstName, String lastName, int checking, int saving , String Type)	//Overloaded Constructor
	{
		this.acctHolderFirstName = firstName;
		this.acctHolderLastName = lastName;
		this.checkingBalance = checking;
		this.savingBalance = saving;
		this.acctType = Type;
	}
	
	public static void getAccountInfo(){	//This method will display Account holder personal and banking details.

		System.out.println("Enter Your First Name");
		acctHolderFirstName = sc.nextLine();
		System.out.println("Enter Your Last Name");
		acctHolderLastName = sc.nextLine();
		//System.out.println("Account Type [Checking/Saving]");
		//acctType = sc.nextLine();
	}
	
	public void deposit()	//This method will ask user to enter the deposit amount then add it to the account.
	{
		Scanner s = new Scanner(System.in);					//asking user for input with scanner class
		System.out.println("\nEnter 1 for Checking and 2 for Savings: ");		//asking the number of minutes to rent
		test=s.nextInt();	
		if (test==1){
			System.out.println("\nEnter the Amount you want to Deposit: ");
			double deposit = sc.nextDouble();
			this.checkingBalance = (int) (this.checkingBalance + deposit);	
		}else if (test==2){
			System.out.println("\nEnter the Amount you want to Deposit: ");
			double deposit = sc.nextDouble();
			this.savingBalance = (int)(this.savingBalance + deposit);
		}
	}
	

	public void displayBalance()	//This method will display the account holder's updated information after deposit.
	{
		System.out.println("First Name = " + this.acctHolderFirstName);
		System.out.println("Last Name = " + this.acctHolderLastName);
		System.out.println("Checking Balance = $"+ this.checkingBalance);
		System.out.println("Saving Balance = $"+ this.savingBalance);
	}
	
	/*
	 * Creating a default constructor taking the following values:
	 * 1. Initializing account Balance
	 * 2. Setting the account Type
	 * 3. Calling getAccountInfo();
	 */

	// CHANGES FOR PROJECT 3 
	private static  int Password = 0000;		//assigning a integer value to password
	
	public static void main(String[] args) { 
		
		System.out.println("--------- BANK ACCOUNT SYSTEM ---------------------");  
	    
		BankAccount herAccount = new BankAccount();
		herAccount.displayBalance();
		herAccount.deposit();
		System.out.println("\nDEPOSIT SUCCESSFUL");
		//assigning initial balance for checking and saving. then setting a password to method setAccountPassword
	    
		String setPassword=setAccountPassword();
		int checkPass =checkPassword(setPassword);
		
		displayBalance(checkingBalance, savingBalance);
		withdraw( checkingBalance, savingBalance , checkPass);
		System.out.println("---------------------------------------------------");   
		deposit( checkingBalance, savingBalance, checkPass);
		System.out.println("--------------------THANK YOU----------------------");   
		transfer ( checkingBalance, savingBalance, checkPass);
		
	}
	                              
	private static void transfer(int checkingBalance, int savingBalance, int checkPass) {
		// TODO Auto-generated method stub
		
	}
								
	private static void deposit(int checkingBalance, int savingBalance, int checkPass) {
		// TODO Auto-generated method stub
		
	}
	
	private static void displayBalance(int checkingBalance, int savingBalance) {
		System.out.println("\n****** ACCOUNT SUMMARY ********");
		System.out.println("Checking Balance:	 " + checkingBalance);
		System.out.println("Saving Balance:		 "+ savingBalance);
		System.out.println("*********************************");
	}
								
	public static String setAccountPassword()
	{
		String  Password="0000";
		System.out.println("\nEnter ACCOUNT PIN [Must be Between 4-8 Characters Long]:");
		Scanner scan =new Scanner(System.in);
		Password=scan.next();
		return Password;
		}

	             
	public static int checkPassword(String setPassword)
	{

		int length = setPassword.length();
		int PIN = Integer.parseInt(setPassword);
		System.out.println("\nThe length of the pin you entered is : "+ length);
		if (length<=4 || length >=8){
			System.out.println("INVALID PIN! \nPlease Enter A Valid Pin!");
		}
		else       		      
		{    		  
			System.out.println("\nPassword VALID! "); 
		} 
		int enCryptData  = PIN %21;
		return enCryptData ;             
	}
	               
	             
	public static void checkpassword(int check, int setPassword){
		if (check==setPassword)        	   
		{    		  
			System.out.println("\nEntered PIN is CORRECT"); 
		}else    		   
			System.out.println("\nEntered PIN is INCORRECT");         
	}
	                           
	public static void withdraw( int checkingBalance, int savingBalance, int checkPass)              
	{         	   
		int amount;         	  
		System.out.println("\nCONFIRM your ACCOUNT PIN to Withdraw: ");
		Scanner scan2 =new Scanner(System.in);
		int  password1=scan2.nextInt();
		if((password1 % 21)!=checkPass)
		{
			System.out.println("\nPlease Enter the CORRECT PIN: ");
			
		}
		if((password1 % 21)==checkPass) {
			System.out.println("\nEnter [1] for CHECKING");
			System.out.println("\nEnter [2] for SAVING");
			Scanner scan3 =new Scanner(System.in);
			int option=scan3.nextInt();
			if(option==1)
			{	    
				System.out.println("\nEnter the WITHDRAWL Amount: ");      
				Scanner scan4 =new Scanner(System.in);   
				int  withdraw=scan4.nextInt();
				if(withdraw <= checkingBalance)
				{
					System.out.println("\nWITHDRAWL AMOUNT: "+ withdraw)  ;		        	
					amount=checkingBalance-withdraw;		        	
					System.out.println("\nREMAINING BALANCE: "+ amount)  ;	
				}
			}
			if(option==2)
			{
				System.out.println("Enter the Amount to WITHDRAWL: ");		    	
				Scanner scan4 =new Scanner(System.in);	
				int  withdraw=scan4.nextInt();
				if(withdraw <= savingBalance)
				{        			
					System.out.println("\nWITHDRAWL AMOUNT: "+ withdraw)  ;    			
					amount=savingBalance-withdraw;
					System.out.println("\nREMAINING BALANCE: "+ amount);
				}
			}	
		}    
	}
}

	        		   