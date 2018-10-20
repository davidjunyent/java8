package contactsimmutable;

import java.util.ArrayList;
import java.util.List;

public final class Contact {

	private final String name;
	private final String lastName;
	private final Address address;
	private final List<String> phoneNumbers;

	public Contact(String name, String lastName, Address address, List<String> phoneNumbers) {
		this.name = name;
		this.lastName = lastName;
		this.address = address.clone();
		this.phoneNumbers = new ArrayList<>(phoneNumbers);
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address.clone();
	}

	public List<String> getPhoneNumbers() {
		return new ArrayList<>(phoneNumbers);
	}

	public Contact changeAddress(Address address) {
		return new Contact(name, lastName, address, getPhoneNumbers());
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", lastName=" + lastName + ", address=" + address + ", phoneNumbers="
				+ phoneNumbers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumbers == null) {
			if (other.phoneNumbers != null)
				return false;
		} else if (!phoneNumbers.equals(other.phoneNumbers))
			return false;
		return true;
	}


	
}
