package SammysMoto;
/*
 * Name: Nitish Kafle
 * Class: CSC 325
 * Assignment: Unit 3 Case Problems
 * Program: Creating a class to hold Rental Data
 */

public class Rental {
	//Initialization of values and variables
	public final int PricePerHour = 40;
	public final int Hour = 60;
	private String contractNumber;
	private int minutes;
	private int hours;
	private double TotalPrice;
	
	public Rental() {
		this ("A000",0);
	}
	
	public Rental(String num, int min) {
		setContractNumber(num);
		setHoursAndMinutes(min);
	}
	
	public void setContractNumber(String num) {
		contractNumber = num;
	}
	
	public void setHoursAndMinutes(int min) {		//calculating total price and storing it in TotalPrice
		minutes = min % Hour;
		hours = min/Hour;
		
		if (minutes <= 40) {
			TotalPrice = hours*PricePerHour + minutes;
		}
		else {
			TotalPrice = PricePerHour * hours + PricePerHour * 1;
		}
	}
	
	public String getcontractNumber() {
		return contractNumber;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	public double getTotalPrice() {
		return TotalPrice;						//Returning the value of TotalPrice
	}
}