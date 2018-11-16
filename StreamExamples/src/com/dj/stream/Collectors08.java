package com.dj.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Collectors08 {
	/**
	 * Stream collectors
	 */
	public static void main(String args[]) {
		
		List<Person> persons=Person.getPersons();
		
		System.out.println("Els que pesen mes de 70 i els que no:");
		Map<Boolean,List<Person>> pesenMesOMenys70=persons.stream()
				.collect(Collectors.partitioningBy(person -> person.getWeight() >70.));
						
		System.out.println(pesenMesOMenys70);
	}
}