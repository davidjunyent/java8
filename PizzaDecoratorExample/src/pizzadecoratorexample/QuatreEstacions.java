package pizzadecoratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuatreEstacions implements Pizza {

	@Override
	public double getCost() {
		return 12;
	}

	@Override
	public List<String> getIngredients() {
		return new ArrayList<>(Arrays.asList("Tomcat", "Formatge", "Orengue" , "Champinyons", "Pernil dolç"));
	}

}
