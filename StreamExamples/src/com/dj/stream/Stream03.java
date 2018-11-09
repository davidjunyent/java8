package com.dj.stream;
import java.util.stream.Stream;

public class Stream03{
	/**
	 * Pinta les 2 primeres a majuscules
	 */
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeu","aqui","alla");
		stream.limit(2).map(paraula -> paraula.toUpperCase()).forEach(System.out::println);;

	}
}
