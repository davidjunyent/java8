package com.dj.stream;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class MethodReference01{
	/**
	 * MethodRefeference examples
	 */
	public static void main (String args[]) {
		
		List<String> strings = new ArrayList<>(Arrays.asList("AAA","bbb","cc","eeee"));
		String unusedStrings="aaa eeee bbbb";
		strings.removeIf(unusedStrings::contains);

		strings.removeIf(UtilsStream19::containsCharcarter);
		
		String prefix="WOW!";
		strings.replaceAll(prefix::concat);
		
		strings.forEach(System.out::println);
		
		Supplier<String> sstr=String::new;
		sstr.get(); // new String()
		UnaryOperator<String> ustr=String::new;
		ustr.apply("AA"); // new String("AA");
		
		Function<String,Integer> fStrInt;
		fStrInt=s->s.length();
		//fStrInt=String::length;
		System.out.println(fStrInt.apply("AA"));
		
		BiFunction<String, String, Integer> biString;
		//biString=(s1,s2)->s1.indexOf(s2);
		biString=String::indexOf;
		System.out.println(biString.apply("bac", "a"));
		
	}
}
class UtilsStream19{
	public static boolean containsCharcarter(String string) {
		return string.indexOf("c")>=0;
	}
}