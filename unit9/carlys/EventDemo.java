package carlys;

import java.util.Scanner;

public class EventDemo{
   public static void main(String[] args){
      String eventNum;
      int guests;
      Event[] events = new Event[3];
      int i;
      for(i = 0; i < events.length; i++) {
         eventNum = getEventNumber();
         guests = getGuests();
         events[i] = new Event(eventNum, guests);
         events[i].setContactPhone(getPhone());
         events[i].setEventType(getType());
      }
      
      //added for unit 9 cases starts here
      
      final int Choice = 4;
      int compare;
      
      System.out.println("\nDisplaying events: ");
      compare = getCompare(Choice);
      while (compare != Choice) {
    	  if (compare == 1) {
    		  sortByEventNumber(events);
    	  } else {
    		  if (compare == 2) {
    			  sortByGuests(events);
    		  } else {
    			  if (compare == 3) {
    				  sortByType(events);
    			  } else {
    				  if (compare == 4) {
    					  break;
    				  } else {
    					  System.out.println("Please Re-Enter");
    					  }
    				  }
    			  }
    		  }
    	  }
    	  compare = getCompare(Choice);
      }
      
//      for(i = 0; i < events.length; i++){
//         displayDetails(events[i]);
//      }
   
   public static int getCompare(final int Choice) {
	   Scanner scanner = new Scanner(System.in);
	   int compare;
	   System.out.println("\n Enter Options: ");
	   System.out.println("\n[1] By Event Number"
	   		+ "\n[2] By Number of Guests"
	   		+ "\n[3] By Event Type"
	   		+ "\n[4] To EXIT");
	   compare = scanner.nextInt();
	   scanner.nextLine();
	   return compare;
   }
   
   public static void sortByEventNumber(Event[] array) {
	   Event temp;
	   String first, second;
	   int arrayLength = array.length - 1;
	   
	   for (int j = 0; j < arrayLength ; j++) {
		   for (int i = 0; i < arrayLength; i++) {
			   first = array[i].getEventNumber();
			   second = array[i+1].getEventNumber();
			   
			   if(first.compareTo(second) > 0) {
				   temp = array[i];
				   array[i] = array[i+1];
				   array[i+1] = temp;
			   }
		   }
	   }
	   
	   for (int j = 0; j < array.length; j++) {
		   displayDetails(array[j]);
	   }
   }
   
   public static void sortByGuests(Event[] array) {
	   Event temp;
	   int arrayLength = array.length-1;
	   
	   for (int j = 0; j < arrayLength; j++) {
		   for (int i = 0; i <arrayLength; i++) {
			   if(array[i].getGuests() > array[i+1].getGuests()) {
				   temp = array[i];
				   array[i] = array[i+1];
				   array[i+1] = temp;
			   }
		   }
	   }
	   for (int j = 0; j < array.length; j++) {
		   displayDetails(array[j]);
	   }
   }
   
   public static void sortByType(Event[] array) {
	   Event temp;
	   int arrayLength = array.length - 1;
	   
	   for(int j = 0; j < arrayLength; j++) {
		   for(int i = 0; i < arrayLength; i++) {
			   if(array[i].getEventType() > array[i+1].getEventType()) {
				   temp = array[i];
				   array[i] = array[i+1];
				   array[i+1] = temp;
			   }
		   }
	   }
	   for(int j = 0; j < array.length; j++) {
		   displayDetails(array[j]);
	   }
   }
   
   //end of unit 9 case
   
   public static String getEventNumber(){
      String num;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Event Number: ");
      num = scanner.nextLine();
      return num;
   } 
   
   public static int getGuests(){
      int guests;
      final int MIN_GUESTS = 5;
      final int MAX_GUESTS = 100;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Number of Guests: ");
      guests = scanner.nextInt();
      while(guests < MIN_GUESTS || guests > MAX_GUESTS){
          System.out.println("The number of guests must be between " +
            MIN_GUESTS + " and " + MAX_GUESTS);
          System.out.print("Please Re-Enter the number of guests: ");
          guests = scanner.nextInt();
      } 
      scanner.nextLine();
      return guests;
   }
   
   public static int getType(){
      int eType;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Event Types: ");
      for(int i = 0; i < Event.event_types.length; i++)
         System.out.println("    " + i + " " + Event.event_types[i]);
      System.out.print("Enter Event Type: ");
      eType = scanner.nextInt();
      return eType;
   }
   
   public static void displayDetails(Event e) {
      System.out.println("\nEvent #" + e.getEventNumber());
      System.out.println("Guests: " + e.getGuests());
      System.out.println("Price Per Guest: $"+ e.getPricePerGuest());
      System.out.println("Total Price: $" + e.getPriceForEvent());
      System.out.println("Large Event : " + (e.getGuests() >= e.cutOffValue));
      System.out.println("Phone Number : " + e.getContactPhone());
      System.out.println("Event Type Selected : " + e.getEventType());
      System.out.println("Event Name: " + e.getEventTypeString());
   }
   
   public static Event getLarger(Event e1, Event e2){
      Event larger = e2;
      if(e1.getGuests() >= e2.getGuests())
         larger = e1;
      return larger;
   }
   public static String getPhone(){
      String phoneNumber;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Phone Number: ");
      phoneNumber = scanner.nextLine();
      return phoneNumber;
   } 
}