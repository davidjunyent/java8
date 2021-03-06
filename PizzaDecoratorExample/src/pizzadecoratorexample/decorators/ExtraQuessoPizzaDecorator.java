package pizzadecoratorexample.decorators;

import java.util.List;

import pizzadecoratorexample.Pizza;

public class ExtraQuessoPizzaDecorator implements Pizza{

	private Pizza pizza;
	
	public ExtraQuessoPizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public double getCost() {
		return pizza.getCost()+1;
	}

	@Override
	public List<String> getIngredients() {
		List<String> ingredients=pizza.getIngredients();
		ingredients.add("ExtraQuesso");
		return ingredients;
	}

}
