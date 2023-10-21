
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ContactTest {
	@Test
	public void addContactIdTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
	
		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Tayla", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
	
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		
		Contact myContact = new Contact();
	
		//Testing Contact ID
		System.out.println("\nTesting if Contact ID is valid\n");
		System.out.println("Testing uniqueness. Expected: Invalid ID: ID Not Unique");
		assertEquals(false, myContact.setContactID(contactList, "999002"));
	
		System.out.println("Testing null. Expected: Invalid ID: ID Null");
		assertEquals(false, myContact.setContactID(contactList, null));
	
		System.out.println("Testing over 10 characters. Expected: Invalid ID: Outside Character Limit");
		assertEquals(false, myContact.setContactID(contactList, "12345678901"));
		
		System.out.println("Testing under 10 characters. Expected: Valid ID");
		assertEquals(true, myContact.setContactID(contactList, "999004"));
		
		System.out.println("Testing 10 characters exactly. Expected: Valid ID");
		assertEquals(true, myContact.setContactID(contactList, "9990041234"));
	
		System.out.println("Testing empty field. Exptected: Invalid ID: Outside Character Limit");
		assertEquals(false, myContact.setContactID(contactList, ""));
	}
	
	@Test
	public void addContactFristNameTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Tayla", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
		
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		
		Contact myContact = new Contact();

		//Testing First Name
		System.out.println("\nTesting if First Name is valid\n");
		System.out.println("Testing over 10 characters. Expected: Invalid First Name: Outside Character Limit");
		assertEquals(false, myContact.setFirstName("Christopher"));
		
		System.out.println("Testing 10 characters exactly. Expected: Valid First Name");
		assertEquals(true, myContact.setFirstName("Heathcliff"));
		
		System.out.println("Testing under 10 characters First Name parameters. Expected: Valid First Name");
		assertEquals(true, myContact.setFirstName("Michael"));
		
		System.out.println("Testing empty field. Expected: Invalid First Name: Outside Character Limit");
		assertEquals(false, myContact.setFirstName(""));
		
		System.out.println("Testing null. Expected: Invalid First Name: First Name Null");
		assertEquals(false, myContact.setFirstName(null));
	}
	
	@Test
	public void addContactLastNameTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Tayla", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
		
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		
		Contact myContact = new Contact();
		
		//Testing Last Name
		System.out.println("\nTesting if Last Name is valid\n");
		System.out.println("Testing over 10 characters. Expected: Invalid Last Name: Outside Character Limit");
		assertEquals(false, myContact.setLastName("Christopher"));
		
		System.out.println("Testing 10 characters exactly. Expected: Valid Last Name");
		assertEquals(true, myContact.setLastName("Heathcliff"));
		
		System.out.println("Testing under 10 characters. Expected: Valid Last Name");
		assertEquals(true, myContact.setLastName("Jordan"));

		System.out.println("Testing empty field. Expected: Invalid Last Name: Outside Character Limit");
		assertEquals(false, myContact.setLastName(""));

		System.out.println("Testing null. Expected: Invalid Last Name: Last Name Null");
		assertEquals(false, myContact.setLastName(null));
	}

	@Test
	public void addContactPhoneNumberTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Tayla", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
		
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		
		Contact myContact = new Contact();
	
		//Testing Phone Number
		System.out.println("\nTesting if Phone Number is valid\n");
		System.out.println("Testing over 10 characters. Expected: Invalid Phone Number: Outside Character Limit");
		assertEquals(false, myContact.setNumber("12345678901"));

		System.out.println("Testing under 10 characters. Expected: Invalid Phone Number: Outside Character Limit");
		assertEquals(false, myContact.setNumber("123456789"));

		System.out.println("Testing null. Expected: Invalid Phone Number: Number Null");
		assertEquals(false, myContact.setNumber(null));

		System.out.println("Testing 10 charcters exactly. Expected: Valid Phone Number");
		assertEquals(true, myContact.setNumber("8049873462"));
	}
	
	@Test
	public void addContactAddressTest() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		Contact contact1 = new Contact("999001", "Joshua", "Brown", "9122390270", "1077 Sapphire Drive");
		Contact contact2 = new Contact("999002", "Tayla", "Scott", "9125849382", "36 Camel Street");
		Contact contact3 = new Contact("999003", "Jamal", "Davis", "7573847263", "1315 Andrews Blvd");
		
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);

		Contact myContact = new Contact();

		//Testing Address
		System.out.println("\nTesting if Address is valid\n");
		System.out.println("Testing over 30 characters. Expected: Invalid Address: Outside Character Limit");
		assertEquals(false, myContact.setAddress("12345678901234567891123456789212345678931"));
		
		System.out.println("Testing under 30 characters. Expected: Valid Address");
		assertEquals(true, myContact.setAddress("1404 Washingtion Rd"));
		
		System.out.println("Testing 30 characters exactly. Expected: Valid Address");
		assertEquals(true, myContact.setAddress("14044 Washingtion Alexander Rd"));

		System.out.println("Testing empty field. Expected: Invalid Address: Outside Character Limit");
		assertEquals(false, myContact.setAddress(""));

		System.out.println("Testing null. Expected: Invalid Address: Adress Null");
		assertEquals(false, myContact.setAddress(null));
		}
}
