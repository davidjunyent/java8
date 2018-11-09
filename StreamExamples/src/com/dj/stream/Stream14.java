package com.dj.stream;
import java.util.stream.Stream;

public class Stream14 {
	
	/**
	 Exercici:
	 Que conti conti quantes a te cada paraula, i si en te mes de 2 nomes suma 2.
	 **/
	public static void main (String args[]) {
		
		Integer result=
		Stream.of("hola","adeu","ara","despres","aqui","abacadarabra","alla")
		.reduce(0, (count,st) -> {
						int numAs=0;
						char[] caracters =st.toCharArray();
						for(char c:caracters) {
							if(c=='a') 	numAs++;	
							if(numAs==2) break;
						}
						return count+numAs;
					}, (count1,count2) -> count1+count2);
		
		
		System.out.println(result);	
		

	}

}
