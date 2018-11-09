package com.dj.stream;
import java.util.stream.Stream;

public class Stream04 {

	/**
	 * Pinta la paraula i la longitud de les 2 primers
	 */
	
	public static void main (String args[]) {

		Stream<String> stream=Stream.of("hola","adeu","aqui","alla");
		stream.limit(2)
			.peek(System.out::println)
			.map(paraula -> paraula.length())
			.forEach(System.out::println);

	}}
