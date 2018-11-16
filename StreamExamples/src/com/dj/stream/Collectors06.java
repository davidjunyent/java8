package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors06 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();

		System.out.println("Agrupades per numero de lletres del nom:");
		Map<Integer,List<Person>> groupByNumLetters=persons.stream()
				//.collect(Collectors.groupingBy(person->person.getName().length()));
				//Clean code
				.collect(Collectors.groupingBy(Person::getNameLenght));
						
		System.out.println(groupByNumLetters);		
	}
}