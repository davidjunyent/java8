package com.dj.stream;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream10 {

	/**
	 * N'hi ha algun que comnenci per e? Quin?
	 */
	
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeuuu","aqui","alla","espasa","despres");
		
		Optional<String> optional= stream.filter(paraula->paraula.startsWith("e")).findAny();
		
		System.out.println(optional.isPresent()?optional.get():"No n'hi ha cap");
	}

}
