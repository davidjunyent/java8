package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors07 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();
		
		System.out.println("Per a cada longitud del nom, la mitja del pes de les persones"
				+ "que tenen aquesta longitud del nom:");
		Map<Integer,Double> mitjaPesSegonsNumeroLLetres=persons.stream()
				.collect(Collectors.groupingBy(
								Person::getNameLenght,
								Collectors.averagingDouble(Person::getWeight)));
						
		System.out.println(mitjaPesSegonsNumeroLLetres);
	}
}