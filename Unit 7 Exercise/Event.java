/*
 * Name: Nitish Kafle
 * Unit 7 Case Problem
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 */

package CarlysMotto;

import java.util.Scanner;

public class Event {
	public final static double LowPricePerGuest = 32.00;
	public final static double HighPricePerGuest = 35.00;
	public final static int cutOffValue = 50;
	
	//added boolean ContactNumber and Price per guest for lab 7
	public boolean largeEvent;
	private String eventNumber;
	private int numberOfGuests;
	private double Price;
	private double PricePerGuest;
	private String ContactNumber;
	private Scanner input = new Scanner(System.in);


	   public Event(String event1, int guests) {
		   //System.out.println("Inside the overloaded constructor");
		   //System.out.println("eventType is" + eventnum);
		   //System.out.println("number of guests is" + guests);
		   //calling member function setEventNumber to initialize eventID
		   
	       eventNumber = event1;
	       numberOfGuests = guests;
	   }
	   //End Code changes for Unit 4 case problem 

	   
	   public Event() {
	       this("A000", 0);
	   }

	   public void setEventNumber() {
	       System.out.println("What is the event number? ");
	       eventNumber = input.nextLine();
	      
	       // Check if event number is a four-character String that starts with a letter followed by three digits
	       if (!eventNumber.matches("[A-Za-z]{1}[0-9]{3}")) {
	           eventNumber = "A000";
	       }
	       eventNumber = eventNumber.toUpperCase();
	   }
	  
	   public void setNumOfGuests() {

	       do {
	           System.out.println("How many guests are attending the event? ");
	           numberOfGuests = input.nextInt();
	           // Clear keyboard buffer
	           input.nextLine();
	          
	           if (numberOfGuests < 5 || numberOfGuests > 100) {
	               System.out.println("The number of guests must be between 5 and 100 ");
	           } else {
	               break;
	           }
	       } while (true);

	       if (isLargeEvent()) {
	           PricePerGuest = LowPricePerGuest;
	       } else {
	           PricePerGuest = HighPricePerGuest;
	       }
	       largeEvent = (numberOfGuests >= cutOffValue);
	       Price = numberOfGuests * PricePerGuest;
	   }
	   
		/*
		 * 
		numberofGuests = numberofGuests;
		//changes made as part of case number 5
		if (numberofGuests >= cutOffValue)
			Price = numberofGuests * lowpricePerGuest;
		else
			Price = numberofGuests * highpricePerGuest;
		
		//if (numberofGuests < cutOffValue)
			//Price = numberofGuests * highpricePerGuest;
		* 
		*/
	
	//this function returns the event number 
	//defined in the class object.

	   public void setContact() {
	       System.out.println("What is the ContactNumber number? ");
	       ContactNumber = input.nextLine();
	      
	       // Keep all digits from input
	       ContactNumber = ContactNumber.replaceAll("\\D+", "");
	      
	       // If user enters fewer or more than 10 digits
	       if (ContactNumber.length() != 10)
	           ContactNumber = "0000000000";
	   }

	   public String getContact() {
	       String phonePattern = "(#1) #2-#3";
	       return phonePattern.replace("#1", ContactNumber.subSequence(0, 3))
	               .replace("#2", ContactNumber.substring(3, 6))
	               .replace("#3", ContactNumber.substring(6));
	   }

	   //this function checks if event is large, 
	   //and if true it will return true, otherwise it will return false
	   public boolean isLargeEvent() {
	       if (this.getNumOfGuests() >= 50)
	           return true;
	       else
	           return false;
	   }

	   public String getEventNumber() {
	       return eventNumber;
	   }

	   public int getNumOfGuests() {
	       return numberOfGuests;
	   }

	   //this function calculates Price and 
	   //returns a double back to calling function
	   public double getPrice() {
	       return Price;
	   }

	   //***Start chapter 5 case problem *****
	   //this function returns Price Per guests
	   public double getPricePerGuest() {
	       return PricePerGuest;
	   }
	}