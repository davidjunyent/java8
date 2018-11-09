package com.dj.stream;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream13 {
	
	/**
	 * Treu els els elements que contenen a separats per ','.
	 * Stream12 pero amb Optional<T>, ens permet diferenciar de quan no tenim cap element.
	 **/
	
	public static void main (String args[]) {

		
		Optional<String> optional=
		Stream.of("hola","adeu","ara","despres","aqui","alla")
		.filter(paraula -> paraula.contains("a"))
		.reduce((element1,element2) -> element1+","+element2);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());	
		}
		
		/*
		 * Function of reduce
		 * 
		 * BinaryOperator<String> binaryOperator = new BinaryOperator<String>() {
		 *
			@Override
			public String apply(String element1, String element2) {
				return element1+","+element2;
			}
		}; 
		**/
	}

}
