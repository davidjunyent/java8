package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors05 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();

		System.out.println("Agrupacio per edat:");
		Map<Integer,List<Person>> groupByAge=persons.stream()
				.collect(Collectors.groupingBy(Person::getAge));						
						
		System.out.println(groupByAge);
	}
}