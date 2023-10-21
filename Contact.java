import java.util.*;


public class Contact {
	//variables
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;	

	//Constructor
	public Contact() {}
	
	public Contact(String theContactID, String theFirstName, String theLastName, String theNumber, String theAddress) {
		this.contactID = theContactID;
		this.firstName = theFirstName;
		this.lastName = theLastName;
		this.number = theNumber;
		this.address = theAddress;
		
	}
	
	//Getters
	public String getContactID() {
		return this.contactID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//Setters
	public boolean setContactID(ArrayList<Contact> myList, String theID) {
		// Check for unique ID
		for (int i = 0; i < myList.size(); ++i) {
			if (myList.get(i).getContactID() == theID) {
				System.out.println("Invalid ID: ID Not Unique");
				return false;
			}
		}
		// Check for null
		if (theID == null) {
			System.out.println("Invalid ID: ID NUll");
			return false;
		}
		//Check for character limit
		if ((theID.length() > 10) || (theID.length() <=0)) {
			System.out.println("Invalid ID: Outside Character Limit");
			return false;
		}
		// Passes checks
		this.contactID = theID;
		System.out.println("Valid ID");
		return true;
	}
	
	public boolean setFirstName(String theFirstName) {
		// Check for null
		if (theFirstName == null) {
			System.out.println("Invalid Fist Name: First Name Null");
			return false;
		}
		// Check for character limit
		if ((theFirstName.length() > 10) || (theFirstName.length() <= 0)) {
			System.out.println("Invalid Last Name: Outside Character Limit");
			return false;
		} 
		// Passes checks
		this.firstName = theFirstName;
		System.out.println("Valid First Name");
		return true;
	}
	
	public boolean setLastName(String theLastName) {
		// Check for null
		if (theLastName == null) {
			System.out.println("Invalid Last Name: Last Name Null");
			return false;
		}
		// Check for character limit
		if ((theLastName.length() > 10) || (theLastName.length() <= 0)) {
			System.out.println("Invalid Last Name: Outside Character Limit");
			return false;
		} 
		
		// Passes checks
		this.lastName = theLastName;
		System.out.println("Valid Last Name");
		return true;
	}
	
	public boolean setNumber(String theNumber) {
		// Check for null
		if (theNumber == null) {
			System.out.println("Invalid Phone Number: Number Null");
			return false;
		}
		// Check for character limit
		if (theNumber.length() != 10) {
			System.out.println("Invalid Phone Number: Outside Character Limit");
			return false;
		} 
		
		// Passes checks
		this.number = theNumber;
		System.out.println("Valid Phone Number");
		return true;
	}
	
	public boolean setAddress(String theAddress) {
		// Check for null
		if (theAddress == null) {
			System.out.println("Invalid Address: Address Null");
			return false;
		}
		
		if ((theAddress.length() > 30) || (theAddress.length() <= 0)) {
			System.out.println("Invalid Address: Outside Character Limit");
			return false;
		} 
		
		// Passes checks
		this.address = theAddress;
		System.out.println("Valid Address");
		return true;
	}
}
