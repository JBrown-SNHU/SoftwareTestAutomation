
import java.util.ArrayList;

public class ContactServices {
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public static boolean addContact(ArrayList<Contact> myList, String theID, String theFirstName, 
			String theLastName, String theNumber, String theAddress) {
		
		Contact myContact = new Contact();
		
		if (!myContact.setContactID(myList, theID)) {
			System.out.println("Failed To Add Contact");
			return false;
		}
		if (!myContact.setFirstName(theFirstName)) {
			System.out.println("Failed To Add Contact");
			return false;
		}
		if (!myContact.setLastName(theLastName)) {
			System.out.println("Failed To Add Contact");
			return false;
		}
		if (!myContact.setNumber(theNumber)) {
			System.out.println("Failed To Add Contact");
			return false;
		}
		if (!myContact.setAddress(theAddress)) {
			System.out.println("Failed To Add Contact");
			return false;
		}
		else {			
			myList.add(myContact);
			
			System.out.println("Your contact has been added.");
			return true;
		}
	}
	
	public static boolean updateContact(ArrayList<Contact> myList, String ID, String theFirstName, 
			String theLastName, String theNumber, String theAddress) {
		
		int contactIndex = -1;
		Boolean idFound = false;
		
		for (int i = 0; i < myList.size(); ++i) {
			if (myList.get(i).getContactID() == ID) {
				contactIndex = i;
				idFound = true;
			}
		}
		if (!idFound) {
			System.out.println("ID Not Found");
			return false;
		}
		if (!myList.get(contactIndex).setFirstName(theFirstName)) {
			System.out.println("Failed To Update First Name Contact");
			return false;
		}
		if (!myList.get(contactIndex).setLastName(theLastName)) {
			System.out.println("Failed To Update Last Name Contact");
			return false;
		}
		if (!myList.get(contactIndex).setNumber(theNumber)) {
			System.out.println("Failed To Update Phone Number Contact");
			return false;
		}
		if (!myList.get(contactIndex).setAddress(theAddress)) {
			System.out.println("Failed To Update Address");
			return false;
		}
		else {

			System.out.println("Your contact has been updated");
			return true;
		}
	}
	
	public static boolean deleteContact(ArrayList<Contact> myList, String ID) {
		Boolean idFound = false;
		int contactIndex = -1;
		
		for (int i = 0; i < myList.size(); ++i) {
			if (myList.get(i).getContactID() == ID) {
				idFound = true;
				contactIndex = i;
			}
		}
		
		if (idFound == true) {
			myList.remove(contactIndex);
			System.out.println("The contact has been deleted");
			return true;
		}
		else {
			System.out.println("ID Not Found");
			return false;
		}
	}
	
	

}
