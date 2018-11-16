package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors10 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();
		
		System.out.println("Nom dels que tenen mes de 50 anys i els que no, separats per coma:");
		Map<Boolean,String> noms=persons.stream()
				.collect(Collectors.partitioningBy(person -> person.getAge()>50,
							Collectors.mapping(Person::getName,
								Collectors.joining(","))));

		System.out.println(noms);
	}
}