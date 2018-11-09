package com.dj.stream;

import java.util.stream.Stream;

public class Stream09 {
	/**
	 * N'hi ha algun que comnenci per e?
	 */
	public static void main (String args[]) {

		Stream<String> stream=Stream.of("hola","adeuuu","aqui","alla","ara","despres");
		
		boolean result= stream.anyMatch(paraula->paraula.startsWith("e"));
		
		System.out.println(result);

	}
}
