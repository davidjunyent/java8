package com.dj.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Treure la suma i lamitja dels 20 primers 
 * múltiples de 13 que tinguin un 3 entre les seves xifres.
 * 
 */
public class Stream17 {
	public static void main (String args[]) {
		final int VALOR_MULTIPLE=13;
		final int LIMIT=20;
		
		System.out.println("Sumem:");
		IntSummaryStatistics intSummaryStatistics=
				IntStream.iterate(VALOR_MULTIPLE, i->i+VALOR_MULTIPLE)
				.filter(i-> String.valueOf(i).contains("3"))
				.limit(LIMIT)
				.peek(Stream17::pintaInt)
				.summaryStatistics();
		
		System.out.println("\nTotal: "+intSummaryStatistics.getSum());	
		
	}
	private static void pintaInt(int valorInt) {
		System.out.print(valorInt+",");
	}
}
