package com.dj.stream;

import java.util.stream.Stream;

public class ParallelStream01 {

	public static void main(String[] args) {
		
		String sequencial = Stream.of("1", "2", "3", "4", "5", "6", "7")
				.peek(System.out::print)
				.reduce("", (s1, s2) -> s1.concat(s2));

		String parallel = Stream.of("1", "2", "3", "4", "5", "6", "7").parallel()
				.peek(System.err::print)
				.reduce("",
				String::concat);

		System.out.println("");
		System.out.println(sequencial);
		System.err.println(parallel);
	}
}
