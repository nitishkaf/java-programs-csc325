package sammys;

import java.util.Scanner;

public class RentalDemo {
	   public static void main(String[] args)
	   {
	      String contractNum;
	      int minutes;
	      
	      //added for unit 8 case problem
	      Rental[] rentals = new Rental[3];
	      
	      int i;
	      for(i = 0; i < rentals.length; ++i){
	         contractNum = getContractNumber();
	         minutes = getMinutes();
	         rentals[i] = new Rental(contractNum, minutes);
	         rentals[i].setContactPhone(getPhone());
	         rentals[i].setEquipType(getType());
	      }
	      
	      for(i = 0; i < rentals.length; ++i) {
	        displayDetails(rentals[i]);
	      }
	   }
	   
	   public static String getContractNumber(){
	      String num;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("\nEnter Contract Number: ");
	      num = scanner.nextLine();
	      return num;
	   }  
	   
	   public static int getMinutes(){
	      int minutes;
	      final int lowestMinutes = 60;
	      final int highestMinutes = 7200;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter Minutes to Rent: ");
	      minutes = scanner.nextInt();
	      
	      while(minutes < lowestMinutes || minutes > highestMinutes){
	         System.out.println("Time must be between " + lowestMinutes +" minutes and " + highestMinutes + " minutes");
	         System.out.print("Please Re-enter minutes of Rental: ");
	         minutes = scanner.nextInt();
	      }
	      return minutes;
	   }
	   
	   //added for unit 8 case problem
	   public static int getType(){
	      int eType;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Equipment Types:");
	      for(int i = 0; i < Rental.types_of_equipment.length; ++i) {
	         System.out.println("   " + i + "  " + Rental.types_of_equipment[i]);
	      }
	      System.out.print("Equipment Type [0-7]: ");
	      eType = scanner.nextInt();
	      return eType;
	   }
	   
	   public static String getPhone(){
		      String phone;
		      Scanner scanner = new Scanner(System.in);
		      System.out.print("Phone Number: ");
		      phone = scanner.nextLine();
		      return phone;
		   } 
	   
	   public static void displayDetails(Rental r){
	      System.out.println("\nContract #" + r.getContractNumber());
	      System.out.println("Time of Rental: " + r.getHours() + " hours and " + r.getExtraMinutes() + " minutes");
	      System.out.println("Rate of Rental ($1 per minute): $" + r.PricePerHour);
	      System.out.println("Phone Number : " + r.getContactPhone());
	      //added for unit 8 case problem
	      System.out.println("Equipment Rental Type #" + r.getEquipType());
	      System.out.println("Equipment : " + r.getEquipTypeString());
	   }   
	   
	   public static Rental getLongerRental(Rental r1, Rental r2){
	      Rental longer = new Rental();
	      int minutes1;
	      int minutes2;
	      // final double COUPON = 0.1;
	      minutes1 = r1.getHours() * Rental.Hour + r1.getExtraMinutes();
	      minutes2 = r2.getHours() * Rental.Hour + r2.getExtraMinutes();
	      if(minutes1 >= minutes2) {
	         longer = r1;
	      } else {
	         longer = r2;  
	      }
	      return longer;
	      
	      /*
	       if (minutes1 >= minutes2) {
			System.out.println("You've earned a reward coupon! Valid for 10% off your next rental. Coupon Value: $"
	                   + (minutes1 * COUPON));
	       }
		else {   
			System.out.println("You've earned a reward coupon! Valid for 10% off your next rental. Coupon Value: $"
	                   + (minutes2 * COUPON));
	       */
	   }
	   
}
