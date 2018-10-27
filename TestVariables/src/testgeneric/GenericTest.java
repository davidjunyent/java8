package testgeneric;

import java.util.Arrays;
import java.util.List;

public class GenericTest {

	// Generic class example
	static class TestGeneric<T> {
		T var;

		public void set(T t) {
			var = t;
		}

		public T get() {
			return var;
		}

		public int getId() {
			return var.hashCode();
		}

		// Generic method example
		public <U> int combineId(U u) {
			return var.hashCode() + u.hashCode();
		}
	}

	public static void main(String args[]) {

		TestGeneric<Integer> testGeneric = new TestGeneric<Integer>();

		testGeneric.get();
		testGeneric.set(22);

		/*
		 * if(testGeneric instanceof TestGeneric<Integer>) { //Cannot use instanceof in
		 * generics }
		 */

		TestGeneric<? extends Number> upperBound;

		upperBound = new TestGeneric<Integer>();
		upperBound = new TestGeneric<Double>();
		upperBound = new TestGeneric<Float>();

		upperBound.get();

		// testNumber.set(b); //can't use with bound ? extends Number

		TestGeneric<? super Number> lowerBound;

		lowerBound = new TestGeneric<Object>();
		lowerBound = new TestGeneric<Number>();

		lowerBound.get();
		lowerBound.set(22);

		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		int result = getIntValuesSum(ints);
		System.out.println(result);

	}

	private static int getIntValuesSum(List<? extends Number> numbers) {
		int result=0;
		for (Number number : numbers) {
			result=result+number.intValue();
		}
		return result;
	}

}
