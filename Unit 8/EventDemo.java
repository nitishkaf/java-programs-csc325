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
      
      for(i = 0; i < events.length; i++){
         displayDetails(events[i]);
      }

   }
   
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