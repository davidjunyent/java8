package pizzadecoratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Margarita implements Pizza {

	@Override
	public double getCost() {
		return 10;
	}

	@Override
	public List<String> getIngredients() {
		return new ArrayList<>(Arrays.asList("Tomcat", "Formatge", "Orengue"));
	}

}
