/*
 * Name: Nitish Kafle
 * Unit 6 Case Problem
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 */
package CarlysMotto;

//importing scanner utility
import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
		System.out.println("Hello World!!!!");
		//changes for case number 5
		Event event1 = new Event();
		int g = getGuestInfo();
		event1.setNumberofGuests(g);
		String ev = getEventType();
		event1.setEventNumber(ev);
		
		Event event2 = new Event();
		 g = getGuestInfo();
		 //Changes for case study 6
		 for ( int i = 0; i<g;i++)
			 System.out.println("\nPlease come to my event! ");
		 
		 
		//assigning event and calling event type
		event1.setNumberofGuests(g);
		String eventX = getEventType();
		event1.setEventNumber(ev);
		
		//comparing two events
		Event e3 = compareEvents(event1,event2);
		
		//OUTPUT 
		System.out.println("Event Type is" + e3.getEventNumber());
		System.out.println("Number of guests in the event: " +
		e3.getNumberofGuests());
		System.out.println("Total cost is: " + e3.getPrice());
		
		
		// TODO Auto-generated method stub

		//instantiate the event object
/*
		Event e = new Event();
		e.setNumberofGuests(20);
		e.setEventNumber("Wedding");
		
		System.out.println("Event Type is" + e.getEventNumber());
		System.out.println("Number of guests in the event: " +
		e.getNumberofGuests());
		System.out.println("Total cost is: " + e.getPrice());
		
		//Starting changes for Unit 4 case problem
		String  x = "YYYY";
		Event myEvent = new Event(x,45);
		System.out.println("Event Type is" + myEvent.getEventNumber());
		System.out.println("Number of guests in the event: " +
		myEvent.getNumberofGuests());
		System.out.println("Total cost is: " + myEvent.getPrice());
		
		//calling the second default constructor
		Event myEvent2 = new Event();
		System.out.println("Event Type is" + myEvent2.getEventNumber());
		System.out.println("Number of guests in the event: " +
		myEvent2.getNumberofGuests());
		System.out.println("Total cost is: " + myEvent2.getPrice());
	*/
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
		*/
		
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

}
