package SammysMoto;
/*
 * Name: Nitish Kafle
 * Class: CSC 325
 * Assignment: Unit 3 Case Problems
 * Program: Making changes to the Rental Class that was created.
 */

//Importing Scanner Class
import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		String contractNum;
	    int minutes;
		
		//Initiating 3 different contract and event and then we ask for the user for the scan.
	    contractNum = getcontractNumber();
		minutes = getMinutes();
		Rental event1 = new Rental(contractNum, minutes);
		
		contractNum = getcontractNumber();
		minutes = getMinutes();
        Rental event2 = new Rental(contractNum, minutes);
        
        contractNum = getcontractNumber();
		minutes = getMinutes();
		Rental event3 = new Rental(contractNum, minutes);
		
		//Using the function displayDetails to display the content of the three object we set in Rental event1, event2 and event3
		displayDetails(event1);		
	    displayDetails(event2);
	    displayDetails(event3);
	    
	    
	    Rental longerRental = new Rental();
	    longerRental = getlonger(event1,event2);
	    longerRental = getlonger(event2,event3);
	    longerRental = getlonger(event1,event3);
	    System.out.println("\nThe higher Contract number is " + longerRental.getcontractNumber());	//compares and returns the higher contract number
	    displayMotto();				//prints the Sammys Motto
	}
	
	public static String getcontractNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Contract Number : ");	//asking user to enter contract number
		String contractNum = scan.nextLine();				// on next line
		return contractNum;									//return what user inputs
	}
	public static int getMinutes()
	{
		Scanner scan = new Scanner(System.in);				//asking user inputs with scanner
		System.out.print("\nEnter minutes : ");				//asking user to input minutes
		int min = scan.nextInt();							//on next line
		return min;											//returns the number of minutes that user inputs
	}
	
	public static void displayMotto()
	    
 	
 	//Output of the Sammy's MOTTO in displayMotto.
	{
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		System.out.println("Ss                                          Ss");
		System.out.println("Ss     Sammy's makes it fun in the sun.     Ss");
		System.out.println("Ss                                          Ss");
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");	
	}
	
	public static void displayDetails(Rental event)		//final output
	{
		System.out.println("\n Contract Number : "+ event.getcontractNumber());
		System.out.println("\nRental Time \n"+ event.getHours() + " Hours \n"+  event.getMinutes() + " minutes \n"+ " TotalPrice: $" + event.getTotalPrice());
	
		}

	public static Rental getlonger(Rental event1, Rental event2)		//comparision
	{
	 Rental getlonger= event1;
	 int minutes1;
	 int minutes2;
	 minutes1= event1.getHours()*60 + event1.getMinutes();
	 minutes2= event2.getHours()*60 + event2.getMinutes();
	 if(event2.getMinutes()> event1.getMinutes()) 
	 {
		{
		getlonger=event2;
		}
	 }
	 else {
		 return event1;
	 }
	return getlonger;
	}  
}
