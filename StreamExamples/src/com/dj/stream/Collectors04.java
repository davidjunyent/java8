package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors04 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();
		
		System.out.println("Tots els que tenen mes de 30 anys en un Map<Nom,Person>:");
		Map<String,Person> filtrats=persons.stream()
				.filter(person -> person.getAge()>30)
				.collect(Collectors.toMap(
									person ->person.getName(), 
									person->person,
									(person1,person2) -> person1.getAge()>=person2.getAge()?person1:person2
									)
						);
		System.out.println(filtrats);
	}
}