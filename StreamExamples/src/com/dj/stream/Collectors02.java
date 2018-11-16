package com.dj.stream;

import java.util.List;
import java.util.stream.Collectors;


public class Collectors02 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();
		
		System.out.println("Tots els que comencen per'p' i pesen mes que 70kg:");
		List<Person> filtrats=persons.stream()
							.filter(person -> person.getName().toLowerCase().startsWith("p"))
							.filter(person -> person.getWeight()>70)
							.collect(Collectors.toList());
		
		filtrats.forEach(System.out::println);
	}
}