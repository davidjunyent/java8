import java.util.function.Consumer;

import pizzadecoratorexample.Margarita;
import pizzadecoratorexample.Pizza;
import pizzadecoratorexample.QuatreEstacions;
import pizzadecoratorexample.decorators.DoubleMassaPizzaDecorator;
import pizzadecoratorexample.decorators.ExtraQuessoPizzaDecorator;
import pizzadecoratorexample.decorators.MeitatPreuPizzaDecorator;
import pizzadecoratorexample.decorators.SalsaPicantePizzaDecorator;

public class PizzaDecoratorExample {
	
	public static void main(String args[]) {
		
		Pizza[] comanda = {
				new QuatreEstacions(),
				new SalsaPicantePizzaDecorator( new DoubleMassaPizzaDecorator(new Margarita())),
				new ExtraQuessoPizzaDecorator(new QuatreEstacions())
		};
		
		if(Math.random()>0.6) {
			System.out.println("UE UE UE! totes les pizzes a meitat de preu!!!\n");
			
			for(int i=0;i<comanda.length;i++) 
				comanda[i]=new MeitatPreuPizzaDecorator(comanda[i]);
		}
		
		
		System.out.println("Procesant comanda...\n");
		double totalcost=0;
		for(Pizza pizza:comanda) {
			//with funcional interface
			//pizza.getIngredients().forEach(new IngredientsConsumer());
			//with lambda expression
			pizza.getIngredients().forEach(ingredient -> System.out.print(ingredient+";"));
			
			System.out.println("Cost: "+pizza.getCost());
			totalcost=totalcost+pizza.getCost();
		}
		System.out.println("\nTotal comanda: "+totalcost);
	}
	
}
class IngredientsConsumer implements Consumer<String>{

	@Override
	public void accept(String ingredient) {
		System.out.print(ingredient+";");
		
	}
	
}
