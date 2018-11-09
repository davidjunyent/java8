package com.dj.stream;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream11 {
	
	/**
	 * Treu tots els caracters dels elements que en tinguin mes 4 caracters
	 */
	
	public static void main (String args[]) {

		Stream<String> stream=Stream.of("hola","adeu","ara","despres","aqui","alla");
		stream
		.filter(paraula -> paraula.length() > 4)
		.flatMap(paraula -> Arrays.stream(paraula.split("")))
				.forEach(System.out::println);;
				
	    /**
	     // Function of FlatMap
	     
		Function<String, Stream<String>> function = new Function<String, Stream<String>>() {
			@Override
			public Stream<String> apply(String t) {
				return Arrays.stream(t.split(""));
			}
		};
		
		**/

	}

}
