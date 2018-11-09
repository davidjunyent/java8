package com.dj.stream;
import java.util.stream.Stream;

public class Stream12 {
	
	/**
	 * Treu els els elements que contenen a separats per ','.
	 **/
	
	public static void main (String args[]) {

		
		String result=
		Stream.of("hola","adeu","ara","despres","aqui","alla")
		.filter(paraula -> paraula.contains("a"))
		.reduce("",(element1,element2) -> element1+","+element2);
		
		System.out.println(result);
		
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
