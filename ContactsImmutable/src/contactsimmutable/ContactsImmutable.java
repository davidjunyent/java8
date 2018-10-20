package contactsimmutable;

import java.util.Arrays;

public class ContactsImmutable {
	
	public static void main(String... args) {
		Contact contact = new Contact("David", "Junyent", new Address("0000", "C\\..sdaf", "no 5"),
				Arrays.asList("999 213232", "992 93293"));

		contact.getAddress().setStreet("blablabla");
		
		contact.getPhoneNumbers().set(0, "999 123 ·4");
		
		System.out.println(contact);
	}
}
