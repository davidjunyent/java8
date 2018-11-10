package com.dj.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Optinals primitius
 * 
 */
public class Stream16 {
	public static void main (String args[]) {
		
		OptionalDouble average=IntStream.range(10, 100)
				.filter(i->i%7==0)
				.average();
		
		if(average.isPresent()) {
			System.out.println(average.getAsDouble());	
		}
	}
}
