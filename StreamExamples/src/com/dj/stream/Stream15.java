package com.dj.stream;

import java.util.stream.IntStream;

/**
 * Stream de tipus basics.
 * 
 */
public class Stream15 {
	public static void main (String args[]) {
		
		System.out.println(IntStream.iterate(0, i->i+7)
				.limit(100)
				.filter(i->i%3==0)
			    .sum());		
	}
}
