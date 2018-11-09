package com.dj.stream;

import java.util.stream.Stream;

public class Stream05 {

	/**
	 * Pinta la paraula i la longitud del 3 i 4 element
	 */
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeu","aqui","alla");
		stream.skip(2).limit(2)
			.peek(System.out::println)
			.map(paraula -> paraula.length())
			.forEach(System.out::println);;
	}
}
