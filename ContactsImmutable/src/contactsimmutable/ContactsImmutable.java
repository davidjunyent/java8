package contactsimmutable;


public class ContactsImmutable {
	
	public static void main(String... args) {
		
		Contact.Builder builder = new Contact.Builder();
		
		builder.setName("David");
		builder.setLastName("Junyent");
		builder.setZipCode("0000");
		builder.setStreet("\"C\\\\..sdaf\"");;
		builder.setNumber("no 5");
		builder.AddPhoneNumbers("999 000 999");
		
		Contact contact = builder.build();

		
		System.out.println(contact);
	}
}
