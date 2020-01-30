package projectone;

/*
 * Name: Nitish Kafle
 * Project : 1
 * Course: CSC325
 * Semester: Spring 2020
 * Instructor: Nazir Nisar
 * 
 * This program helps to convert the temperature from celcius to fahrenheit and vice versa.
 * The program does not need any scanner because we are not asking user for the input.
 * We used the physics formula (arithmetic) to process the equation for conversion
 */

public class temperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// the double variable holds floating point values and can hold large or small numbers.
	
		double celcius1, celcius2, farenheit1, farenheit2;
	
		// assigning the values to the variables
		farenheit1 = 98;
		celcius1 = (farenheit1 - 32)*(5.0/9);
	
	
		celcius2 = 26;
		farenheit2 = (celcius2 * (9.0/5)) + 32;
	

		System.out.println(farenheit1 + " degrees in Farenheit temperature converted to Celcius is: "+celcius1+" degrees");
		System.out.println(celcius2 + " degrees in Celcius converted to Fahrenheit is "+farenheit2+" degrees");
	}

}
