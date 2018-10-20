package contactsimmutable;

public class Address {

	private String zipCode;
	private String street;
	private String number;

	public Address(String zipCode, String street, String number) {
		this.zipCode = zipCode;
		this.street = street;
		this.number = number;
	}

	@Override
	protected Address clone() {
		return new Address(zipCode, street, number);
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", street=" + street + ", number=" + number + "]";
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
