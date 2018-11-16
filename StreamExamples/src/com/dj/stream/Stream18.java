package com.dj.stream;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Stream18{
	/**
	 * Mitja de la longitud dels elements del stream
	 */
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeuuu","aqui","allaa","despres");
		
		IntSummaryStatistics intSummaryStatistics=stream
				.mapToInt(s-> s.length())
				.peek(System.out::println)
				.summaryStatistics();
		
		System.out.println("="+intSummaryStatistics.getAverage());
	}
}
