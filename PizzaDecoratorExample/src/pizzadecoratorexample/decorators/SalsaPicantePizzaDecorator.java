package pizzadecoratorexample.decorators;

import java.util.List;

import pizzadecoratorexample.Pizza;

public class SalsaPicantePizzaDecorator implements Pizza{

	private Pizza pizza;
	
	public SalsaPicantePizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public double getCost() {
		return pizza.getCost()+0.5;
	}

	@Override
	public List<String> getIngredients() {
		List<String> ingredients=pizza.getIngredients();
		ingredients.add("SalsaPicante");
		return ingredients;
	}

}
