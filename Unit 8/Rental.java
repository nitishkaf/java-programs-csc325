package sammys;

public class Rental {
	   public static final int Hour = 60;
	   public static final int PricePerHour = 40;
	   
	   private String contractNumber;
	   private int hours;
	   private int extraTime;
	   private double price;
	   private String contactPhone;
	   
	   //added for unit 8 case problem
	   private int equipType;
	   public static final int lengthOfContract = 4;
	   public static final String[] types_of_equipment = {"personal watercraft", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella", "other"}; 
	    
	   //Default Constructor
	   public Rental(){
	      this("A000", 0);
	   }
	   
	   //Parameterized constructor
	   public Rental(String num, int minutes){
	      setContractNumber(num);
	      setHoursAndMinutes(minutes);
	   }
	   

	   //this assigns contract number
	   public void setContractNumber(String num)
	   {
	      boolean numOk = true;
	      if(num.length() != lengthOfContract || !Character.isLetter(num.charAt(0)) || !Character.isDigit(num.charAt(1)) || !Character.isDigit(num.charAt(2)) || !Character.isDigit(num.charAt(3))) { 
	            contractNumber = "A000";  
	      } else {
	            contractNumber = num.toUpperCase();
	      }
	    /*
	     * 		
	     if(num.matches("[a-zA-Z][0-9]{3}"))   
		{
			num = num.substring(0, 1).toUpperCase() + num.substring(1);
			contractNumber = num;   
		}
		else
		{
			setContractNumber("A000"); 
		}   
	     */
	   }
	   
	   //this gives final hours and minutes
	   public void setHoursAndMinutes(int minutes){
	      hours = minutes / Hour;
	      extraTime = minutes % Hour;
	      if(extraTime <= PricePerHour)
	         price = hours * PricePerHour + extraTime;
	      else
	         price = hours * PricePerHour + PricePerHour;
	   }
	   
	   
	   //METHODS
	   public String getContractNumber(){
	      return contractNumber;
	   }
	   
	   public int getHours(){
	      return hours;
	   }
	   
	   public int getExtraMinutes(){
	      return extraTime;
	   }
	   
	   public double getPrice(){
	      return price;
	   }
	   
	   public String getContactPhone(){
	      String phone;
	      phone = "(" + contactPhone.substring(0, 3) + ") " + contactPhone.substring(3, 6) + "-" + contactPhone.substring(6, 10);
	      return phone;
	   }
	   

	   public void setEquipType(int eType) {
	      if(eType < types_of_equipment.length) {
	         equipType = eType;
	      } else {
	         equipType = types_of_equipment.length - 1;
	      }
	   }
	   
	   //method added for unit 8 case problem
	   public int getEquipType() {
	      return equipType;
	   }
	   
	   public String getEquipTypeString() {
	      return types_of_equipment[equipType];
	   }    
	   
	   public void setContactPhone(String phone){
		   
		      final int VALID_LEN = 10;
		      final String INVALID_PHONE = "0000000000";
		      contactPhone = "";
		      int len = phone.length();
		      
		      for(int x = 0; x < len; ++x){
		         if(Character.isDigit(phone.charAt(x))) {
		            contactPhone += phone.charAt(x);
		         }
		      }
		      
		      if(contactPhone.length() != VALID_LEN) {
		         contactPhone = INVALID_PHONE;
		      }
		   }
		   
}
