package pizzadecoratorexample.decorators;

import java.util.List;

import pizzadecoratorexample.Pizza;

public class MeitatPreuPizzaDecorator implements Pizza{

	private Pizza pizza;
	
	public MeitatPreuPizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
		
	}
	
	@Override
	public double getCost() {
		return  pizza.getCost()/2;
	}

	@Override
	public List<String> getIngredients() {
		return pizza.getIngredients();
	}

}
