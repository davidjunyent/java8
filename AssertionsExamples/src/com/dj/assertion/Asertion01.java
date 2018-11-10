package com.dj.assertion;

/**
 * Run with -ea argument *
 */
public class Asertion01 {

	public static void main(String[] args) {
		try {
			Person person = new Person("David", 15, 0.0);
			person.setName(null);
			System.out.println("done");
		} catch (IllegalArgumentException illegalArgumentException) {
			System.out.println("Catch IllegalArgumentException");
		}
		System.out.println("End of Main");
	}
}
