package SammysMoto;
/*
 * Name: Nitish Kafle
 * Class: CSC 325
 * Assignment: Unit 7 Case Problems
 */

public class Rental {   
	
	//assinging values to variable and then string and integers
	public final static int Hour = 60;
	public final static double PricePerHour = 40.00;   
	private double price;
	private String contractNumber;
	private int hours;
	private int extraTime;
	private String contactNumber;

	//DEFAULT CONSTRUCTOR
	Rental() {
		this("A000", 0);   
	}

	
	//PARAMETERIZED CONSTRUCTOR
	Rental(String num, int minutes) {
		setContractNumber(num);
		setHoursAndMinutes(minutes);
	}

	//this assigns contract number
	public void setContractNumber(String num) {
		if(num.matches("[a-zA-Z][0-9]{3}"))   
		{
			num = num.substring(0, 1).toUpperCase() + num.substring(1);
			contractNumber = num;   
		}
		else
		{
			setContractNumber("A000"); 
		}   
	}
   
	//this gives final hours and minutes
	public void setHoursAndMinutes(int minutes) {
		hours = minutes / Hour;
		extraTime = minutes % Hour;
		if (extraTime <= PricePerHour)  
			price = hours * PricePerHour + extraTime;   
		else
			price = hours * PricePerHour + PricePerHour;   
	}
	   
	//METHODS
	public String getContractNumber() {
		return contractNumber;   
	}

	public double getPrice() {
		return price;
	}

	public int getHours() {
		return hours;   
	}

	public int getExtraTime() {
		return extraTime;
	}

	public String getContactNumber() {

		if(contactNumber !=null && !contactNumber.isEmpty()) 
			return " (" + contactNumber.substring(0, 3) + ") " + contactNumber.substring(3, 6) + " - " + contactNumber.substring(6);
		return "";   
	}

	public void setContactPhoneNumber(String contactNumber) {
		contactNumber= contactNumber.replaceAll("[^a-zA-Z0-9]", "");
		if(contactNumber.length()<10)   
		{
			setContactPhoneNumber("0000000000"); 
		}
		else
		{
			this.contactNumber = contactNumber; 
		}   
	}	
}