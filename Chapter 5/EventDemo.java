/*
 * Name: Nitish Kafle
 * Unit 5 Case Problem
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 */
package CarlysMotto;

import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
		System.out.println("hello world");
		//changes for case number 5
		Event event1 = new Event();
		int g = getGuestInfo();
		event1.setNumberofGuests(g);
		String ev = getEventType();
		event1.setEventNumber(ev);
		
		Event event2 = new Event();
		 g = getGuestInfo();
		event1.setNumberofGuests(g);
		String evx = getEventType();
		event1.setEventNumber(ev);
		
		Event event3 = compareEvents(event1,event2);
		
		
		System.out.println("Event Type is" + event3.getEventNumber());
		System.out.println("Number of guests in the event: " +
		event3.getNumberofGuests());
		System.out.println("Total cost is: " + event3.getPrice());

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
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of guests");
		int ng = scan.nextInt();
		return ng;
	}
	public static String getEventType()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Event Type");
		String  ng = scan.nextLine();
		return ng;
	}
	
	public static Event compareEvents(Event event1, Event event2)
	{
		if (event1.getNumberofGuests() > event2.getNumberofGuests())
		return event1;
		else return event2;
	}

}
