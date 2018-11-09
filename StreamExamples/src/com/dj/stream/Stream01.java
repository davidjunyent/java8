package com.dj.stream;
import java.util.stream.Stream;

public class Stream01 {
	/**
	 * Printa totes les paraules i despres les que comencen per 'a'
	 */
	
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeu","aqui","alla");
		
		stream.peek(System.out::println) 
			.filter(paraula->paraula.startsWith("a"))
			.forEach(System.out::println);

	}
}
