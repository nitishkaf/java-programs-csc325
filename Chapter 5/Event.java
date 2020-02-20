/*
 * Name: Nitish Kafle
 * Unit 5 Case Problem
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 */
package CarlysMotto;

public class Event {
	public final int lowpricePerGuest = 32;
	public final int highpricePerGuest = 35;
	public final int cutOffValue = 50;
	
	private String eventNumber;
	private int numberofGuests;
	private double price;
	//Code changes for Unit 4 case problem
	Event()
	{
		this("AOOO",0);
		//System.out.println("Inside the default constructor");
		
	}

	Event( double x, int guests)
	{
		
	}
	Event( float x, int guests)
	{
		
	}
	Event(String eventnum, int guests)
	{
		//System.out.println("Inside the overloaded constructor");
		//System.out.println("eventType is" + eventnum);
		//System.out.println("number of guests is" + guests);
		
		//calling member function setEventNumber to initialize eventID
		setEventNumber(eventnum);
		setNumberofGuests(guests);
	}
	
	//End Code changes for Unit 4 case problem 
	public void setEventNumber(String eventNum)
	{
		eventNumber = eventNum;
	}
	public void setNumberofGuests(int numofguests)
	{
		numberofGuests = numofguests;
		//changes made as part of case number 5
		if (numofguests >= cutOffValue)
			price = numberofGuests * lowpricePerGuest;
		else
			price = numberofGuests * highpricePerGuest;
		
		//if (numofguests < cutOffValue)
			//price = numberofGuests * highpricePerGuest;
	}
	//this function returns the event number 
	//defined in the class object.
	public String getEventNumber()
	{
		return eventNumber;
	}
	public int getNumberofGuests()
	{
		return numberofGuests;
	}
	//this function calculates price and 
	//returns a double back to calling function
	public double getPrice()
	{
		return price;
	}
	//***Start chapter 5 case problem *****
	//this function returns price Per guests
	public int getPricePerGuest()
	{
		return 0;
	}
	//this function checks if event is large, 
	//and if true it will return true, otherwise it will return false
	public boolean isLargeEvent(){
		{
			if (numberofGuests >= cutOffValue)
			return true;
			else 
				return false;
		}
		
	}
	
}
