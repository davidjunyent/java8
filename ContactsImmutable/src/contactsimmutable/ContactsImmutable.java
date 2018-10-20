package contactsimmutable;


public class ContactsImmutable {
	
	public static void main(String... args) {
		
		Contact.Builder contcatBuilder = new Contact.Builder();
		
		contcatBuilder.name("David").lastName("Junyent");
		contcatBuilder.zipCode("0000").street("\"C\\\\..sdaf\"").number("no 5");
		contcatBuilder.AddPhone("999 000 999");
		
		Contact contact = contcatBuilder.build();

		
		System.out.println(contact);
	}
}
