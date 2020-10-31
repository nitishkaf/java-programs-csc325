package carlys;

public class Event
{
	   public final static double HighPricePerGuest = 35.00;
	   public final static double LowPricePerGuest = 32.00;  
	   public final static int cutOffValue = 50;
	   
	   private String eventNumber;
	   private int guests;
	   private double pricePerGuest;
	   private double priceForEvent;
	   private String contactPhone;
	   
	   //added for unit 8 case 
	   public final static int lengthOfEvent = 4;
	   public final static String[] event_types = {"wedding", "baptism", "birthday", "corporate", "other"}; 
	   private int eventType;

	   public Event(String num, int guests){
	   //System.out.println("Inside the overloaded constructor");
	   //System.out.println("eventType is" + eventnum);
	   //System.out.println("number of guests is" + guests);
	   //calling member function setEventNumber to initialize eventID
	      setEventNumber(num);
	      setGuests(guests);
	   }
	   
	   //End code changes for unit 4 case problem
	   
	   public Event(){
		      this("A000", 0);
		   }
		   
	   
	   public void setEventNumber(String num){
		  boolean numOk=true;
		  
		  if(num.length() != lengthOfEvent || !Character.isLetter(num.charAt(0)) || !Character.isDigit(num.charAt(1)) || !Character.isDigit(num.charAt(2)) || !Character.isDigit(num.charAt(3))) { 
	          eventNumber = "A000";      
		  } else {
	         eventNumber = num.toUpperCase();
		  }
		  
		  /*
	      if (!num.matches("[A-Za-z]{1}[0-9]{3}")) {
	           num = "A000";
	       }
	       num = num.toUpperCase();
	      */
	   }
	   
	   public void setGuests(int guest){
	      guests = guest;
	      if(isLargeEvent()){
	         pricePerGuest = LowPricePerGuest;
	         priceForEvent = guests * LowPricePerGuest;
	      } else {
	         pricePerGuest = HighPricePerGuest;
	         priceForEvent = guests * HighPricePerGuest;
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
	   }
	   
	   public String getContactPhone()
	   {
	      String phoneNumber;
	      phoneNumber = "(" + contactPhone.substring(0, 3) + ") " +
	         contactPhone.substring(3, 6) + "-" +
	         contactPhone.substring(6, 10);
	      return phoneNumber;
	   }
	   
	   public void setContactPhone(String phoneNumber)
	   {
	      final int phone_Length = 10;
	      final String INVALID_PHONE = "0000000000";
	      contactPhone = "";
	      int len = phoneNumber.length();
	      for(int x = 0; x < len; ++x)
	      {
	         if(Character.isDigit(phoneNumber.charAt(x)))
	            contactPhone += phoneNumber.charAt(x);
	      }
	      if(contactPhone.length() != phone_Length)
	         contactPhone = INVALID_PHONE;
	   }
	   
	   //this function checks if event is large.
	   public boolean isLargeEvent()
	   {
	      boolean isLarge = false;
	      if(guests >= cutOffValue)
	         isLarge = true;
	      return isLarge;
	   }
	   
	   public int getGuests() {
		      return guests;
		   }
	   
	   public String getEventNumber() {
		      return eventNumber;
		   }
	   
	   public double getPriceForEvent() {
		      return priceForEvent;
		   }
	   
	   //function for chapter 5 case problem
	   public double getPricePerGuest(){
	      return pricePerGuest;
	   }
	   
	 //added setters and getters for unit 8 case problems
	   public void setEventType(int code){
	      if(code < event_types.length)
	         eventType = code;
	      else
	         eventType = event_types.length - 1;
	   }
	   
	   public int getEventType(){
	     return eventType;
	   }
	   
	   public String getEventTypeString() {
	      return event_types[eventType];
	   }
	   
	   
	}