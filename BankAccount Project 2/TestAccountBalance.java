/*
 * Name: Nitish Kafle
 * Program: Bank Account (Project 2)
 * Class: CSC325
 * Spring 2020
 * 
*/

package bankAccount;

//This class initiates BankAccount object and calls the member functions
public class TestAccountBalance{
	
	public static void main(String []args) {
		
		BankAccount herAccount = new BankAccount();
		herAccount.displayBalance();
		herAccount.deposit();
		System.out.println("Deposit Successful");
		herAccount.displayBalance();
		
		/*
		 * For RonaldoAccount, following parameters can be used:
		 * 
		 * BankAccount herAccount = new BankAccount();
		 * hisAccount.displayBalance();
		 * hisAccount.deposit();
		 * System.out.println("Deposit Successful");
		 * hisAccount.displayBalance();
		 *
		 */
	}
}