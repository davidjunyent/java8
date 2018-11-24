package com.dj.stream;

import java.util.stream.Stream;

public class ParallelStream02 {

	public static void main(String[] args) {
		
		String words[] ="Apache Derby, an Apache DB subproject, is an open source relational database implemented entirely in Java and available under the Apache License, Version 2.0.".split(" ");
		String sequencial = Stream.of(words)
				.peek(System.out::println)
				.reduce("",(w1,w2)->w1+" * "+w2);

		String parallel = Stream.of(words)
				.peek(System.err::println)
				.parallel()
				.reduce("",(w1,w2)->w1+" * "+w2);

		System.out.println("");
		System.out.println(sequencial);
		System.err.println(parallel);
	}
}
