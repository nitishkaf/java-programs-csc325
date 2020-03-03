package SammysMoto;
/*
 * Name: Nitish Kafle
 * Class: CSC 325
 * Assignment: Unit 7 Case Problems
 */

//Importing Scanner Class
import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		String contractNum;  
		String contactNumber;

		int minutes;
		contractNum = getContractNumber();
		contactNumber = getContractPhoneNumber();
		minutes = getMinutes();
		Rental r1 = new Rental(contractNum, minutes);
		r1.setContactPhoneNumber(contactNumber);	    
		contractNum = getContractNumber();
		minutes = getMinutes();
		Rental r2 = new Rental(contractNum, minutes);
		contractNum = getContractNumber();
		minutes = getMinutes();
		Rental r3 = new Rental(contractNum, minutes);

		displayDetails(r1);
		displayDetails(r2);
		displayDetails(r3);

		System.out.println("\nContract Number: " + r1.getContractNumber() + " Time: " + r1.getHours() + " hours and "
	               + r1.getExtraTime() + " minutes,\n and Contract Number: " + r2.getContractNumber() + " Time: "
	               + r2.getHours() + " hours and " + r2.getExtraTime()
	               + " minutes,\n the one with the longer time is Contract #"
	               + getLongerRental(r1, r2).getContractNumber());
	    
		System.out.println("\nContract Number: " + r1.getContractNumber() + " Time: " + r1.getHours() + " hours and "
	               + r1.getExtraTime() + " minutes,\n and Contract Number: " + r3.getContractNumber() + " Time: "
	               + r3.getHours() + " hours and " + r3.getExtraTime()
	               + " minutes,\n the one with the longer time is Contract #"
	               + getLongerRental(r1, r3).getContractNumber());
   
		System.out.println("\nContract Number: " + r2.getContractNumber() + " Time: " + r2.getHours() + " hours and "
	               + r2.getExtraTime() + " minutes,\n and Contract Number: " + r3.getContractNumber() + " Time: "
	               + r3.getHours() + " hours and " + r3.getExtraTime()
	               + " minutes,\n the one with the longer time is Contract #"
	               + getLongerRental(r2, r3).getContractNumber());
	   }


	public static String getContractNumber() {
		String num;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter contract number: ");
		num = scan.nextLine();
		return num;   
	}

	   
	public static String getContractPhoneNumber() {
		String num;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter Phone Numebr: ");
		num = scan.nextLine();
		return num;   
	}


	public static int getMinutes() {
		int minutes;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter minutes to rent: ");
	    
		minutes = scan.nextInt();
		do {
	           if (minutes <= 60 || minutes >= 7200) {
	        	   System.out.println("Please enter a valid scan for minuted (between 60 and 7200)");
	        	   System.out.print("Enter minutes to rent: ");
	        	   minutes = scan.nextInt();
	           }
		}while (minutes <= 59 || minutes >= 7201);
		return minutes;   
	}

	  
	public static void displayDetails(Rental r) {
		System.out.println("\nContract #" + r.getContractNumber());
		System.out.println("\nContact Phone Number#" + r.getContactNumber());
		System.out.print("For a rental of " + r.getHours() + " hours and " + r.getExtraTime());
		System.out.printf(" minutes, at a rate of $%.2f\n", r.getPrice());   
	}

	 
	public static Rental getLongerRental(Rental r1, Rental r2) {	
		Rental longer = new Rental();
		int minutes1;
		int minutes2;
		final double COUPON = 0.1;
		minutes1 = r1.getHours() * Rental.Hour + r1.getExtraTime();
		minutes2 = r2.getHours() * Rental.Hour + r2.getExtraTime();	    
		if (minutes1 >= minutes2) {
	    	longer = r1;
	       }else {
	    	   longer = r2;
	    	   return longer;
	       }
		if (minutes1 >= minutes2) {
			System.out.println("You've earned a reward coupon! Valid for 10% off your next rental. Coupon Value: $"
	                   + (minutes1 * COUPON));
	       }
		else {   
			System.out.println("You've earned a reward coupon! Valid for 10% off your next rental. Coupon Value: $"
	                   + (minutes2 * COUPON));
	       }   
		return longer;   
	}	
}