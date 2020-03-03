/*
 * Name: Nitish Kafle
 * Unit 7 Case Problem
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 */

package CarlysMotto;

public class EventDemo {
	public static void main(String[] args) {
		
		//changes for case 7
		Event event1 = new Event();
		System.out.println("Event 1: ");
		event1.setEventNumber();
		event1.setNumOfGuests();
		event1.setContact();
		System.out.println();
	      
	       
		Event event2 = new Event();
		System.out.println("Event 2: ");
		event2.setEventNumber();
		event2.setNumOfGuests();
		event2.setContact();
		System.out.println();

		
	      
		Event event3 = new Event();
		System.out.println("Event 3: ");
		event3.setEventNumber();
		event3.setNumOfGuests();
		event3.setContact();
		System.out.println();

	     
		//displays event 1,2,3 outputs
		display(event1);
		display(event2);
		display(event3);
		
		//compares and displays the greater one
		System.out.println("EVENT 1 & 2. Larger is: ");
		display(largerEvent(event1, event2));
		System.out.println("EVENT 2 & 3. Larger is: ");
		display(largerEvent(event2, event3));
		System.out.println("EVENT 1 & 3. Larger is: ");    
		display(largerEvent(event1, event3));
		
		//condition and loop
		for (int i = 0; i < event1.getNumOfGuests(); i++) {
	           System.out.println("Please come to my Event!");
	       }
	   }
	
	/*
	}
	public static int getGuestInfo()
	{
		Scanner scan = new Scanner(System.in);		//asking user for the input
		int ng = 0;									//assigning variable with 0 for the loop
		//using DO WHILE LOOP
		/*do
		{
		System.out.println("Enter number of guests");
		//changes for module 6 case study
		ng = scan.nextInt();
		} while (ng < 5 || ng >100);
		
		//USING WHILE LOOP
		while (ng <5 || ng >100)					//conditional statement
		{
			System.out.println("Enter the number of guests : ");
			
			//Changes for Unit 6 Case Problem
			ng = scan.nextInt();					//input on next line, must be an integer
			if (ng <5 || ng >100)
				System.out.println("Please enter a value between 5 and 100)");
		}
		return ng;									//returning the value user inputs
	}
	
	public static String getEventType()
	{
		Scanner scan = new Scanner(System.in);		//asking user for input
		System.out.println("\nEnter Event Type : ");
		String  ng = scan.nextLine();				//input on next line
		return ng;									//returns the value of ng that user enters
	}
	
	//comparision between two events and returning the result
	public static Event compareEvents(Event event1, Event event2)
	{
		if (event1.getNumberofGuests() > event2.getNumberofGuests())
		return event1;
		else return event2;
	}
	*/
	
	public static void display(Event e) {
	
		System.out.println("Event 1 Contract Number: " + e.getEventNumber());
		System.out.println("Number of Guests: " + e.getNumOfGuests());
		System.out.println("Contact Phone: " + e.getContact());
		System.out.println("Total Price per guest: $" + String.format("%.2f", e.getPricePerGuest()));
		System.out.println("Total Price: $" + String.format("%.2f", e.getPrice()));
		System.out.println("Large Event Is : " + e.isLargeEvent());
		System.out.println("");   
	}


	  
	public static Event largerEvent(Event e1, Event e2) {
	
		if (e1.getNumOfGuests() >= e2.getNumOfGuests())
			return e1;
		else	    
			return e2;

	}	
}