package com.dj.assertion;

/**
 * Run with -ea argument *
 */
public class Asertion02 {

	public static void main(String[] args) {
		try {
			Person person = new Person("David", 15, 0.0);
			person.setName("");
			System.out.println("done");
		} catch (IllegalArgumentException illegalArgumentException) {
			System.out.println("Catch IllegalArgumentException: " + illegalArgumentException);
		}
		System.out.println("End of Main");
	}
}
