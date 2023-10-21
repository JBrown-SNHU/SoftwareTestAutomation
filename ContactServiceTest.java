
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ContactServiceTest {
	
	
	@Test
	public void addContactTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
	
		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Tayla", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
	
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		
	
		//Testing Contact ID
		System.out.println("\nTesting fuction to add a Contact\n");
		System.out.println("Testing with ID that is not Unique. Expected: Failed To Add Contact");
		assertEquals(false, ContactServices.addContact(contactList, "999003", "Taylor", "Jackson", "9993827364", "22 Doral Lane"));
		
		System.out.println("Testing with unique ID. Expected: Your contact has been added.");
		assertEquals(true, ContactServices.addContact(contactList, "999004", "Taylor", "Jackson", "9993827364", "22 Doral Lane"));
	}


	
	@Test
	public void deleteContactsTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();

		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Tayla", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
		
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		
		//Testing Contacts Are Deleted
		System.out.println("\nTesting fuction to delete contacts\n");
		System.out.println("Testing with ID not in the list. Expected: ID Not Found");
		assertEquals(false, ContactServices.deleteContact(contactList, "abc123"));
		
		System.out.println("Testing valid Contact ID to look up contact. Expect: The contact has been deleted");
		assertEquals(true, ContactServices.deleteContact(contactList, "999003"));
		
		System.out.println("Testing if contact exist after being deleted. Expect: ID Not Found");
		assertEquals(false, ContactServices.deleteContact(contactList, "999003"));
	}
	
	@Test
	public void updateContactsTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();

		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Taylor", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
		
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		
		//Testing Contacts AreUpdated
		System.out.println("\nTesting function to update contacts\n");
		System.out.println("Testing with ID not in the list. Expected: ID Not Found");
		assertEquals(false, ContactServices.updateContact(contactList, "abc123", "Tayla", "Brown", "9125365864", "1077 Sapphirre Drive"));
		
		System.out.println("Testing ID that is in the list. Expect: Your contact has been updated");
		assertEquals(true, ContactServices.updateContact(contactList, "999002", "Tayla", "Brown", "9125365964", "1077 Sapphirre Drive"));
		
	}
}

