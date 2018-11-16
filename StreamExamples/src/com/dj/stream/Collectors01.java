package com.dj.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Collectors01{
	/**
	 * Stream collectors
	 */
	public static void main (String args[]) {
		System.out.println(saludaATots("David","Marta","Neus","Maria"));
	}
	
	public static String saludaATots(String ... names) {
		Stream<String> stream =Stream.of(names);
		return stream.collect(Collectors.joining(", ","Hola ","!"));
	}
}