package bankExample;

public class Address {

	//information needed for address is
	String addLineOne;
	String addLineTwo;
	String city;
	String state;
	String zipCode;
	
	//default constructor -for the times that we do not have address info and still need to create an object of the class 
	public Address () {
		addLineOne = "";
		addLineTwo = "";
		city = "";
		state = "";
	    zipCode = "";
	    
	    }
	
	//we need one parameterized constructor that will take all of the address info and assign it to the variables in the obj
	public Address (String addL1, String addL2, String c, String s, String z) {
		
	addLineOne = addL1;
	addLineTwo = addL2;
	city = c;
	state = s;
	zipCode = z;
}
	public String toString() { // this is the toString method - the definition of the method should match this exactly 
		return "Address: " + addLineOne + " " + addLineTwo + "," + city + "," + state + ", " +zipCode;
		}
	public static void main(String[] args) {
		
		Address sample = new Address("6201 Leesburg Pike", "Ste 216", "Falls Church", "VA", "22044");
		
		System.out.println(sample);

		
	}
		

		
	
	}
