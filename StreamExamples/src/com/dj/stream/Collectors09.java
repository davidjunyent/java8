package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors09 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();
		
		System.out.println("La mitja de la edat de les persones que pesen mes de 70 i els que no.");
		Map<Boolean,Double> mitjaEdatPesOMenys70=persons.stream()
				.collect(Collectors.
						partitioningBy(person -> person.getWeight() >70,
										Collectors.averagingInt(Person::getAge)
					));
						
		System.out.println(mitjaEdatPesOMenys70);
	}
}