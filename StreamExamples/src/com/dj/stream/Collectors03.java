package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors03 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();
		
		System.out.println("Tots els que tenen mes de 30 anys en un Map<Nom,Person>");

		try {
			Map<String,Person> filtrats=persons.stream()
								.filter(person -> person.getAge()>30)
								.collect(Collectors.toMap(person ->person.getName(), person->person));
								//.collect(Collectors.toMap(Person::getName, Person::this));
			System.out.println(filtrats);
		}catch(Exception ex) {
			//casca perque supliquem una clau
			ex.printStackTrace();
			
		}
	}
}