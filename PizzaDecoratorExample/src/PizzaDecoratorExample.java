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
			System.out.println("UE UE UE! totes les pizzes a meitat de preu!!!");
			
			for(int i=0;i<comanda.length;i++) 
				comanda[i]=new MeitatPreuPizzaDecorator(comanda[i]);
		}
		
		
		double totalcost=0;
		for(Pizza pizza:comanda) {
			System.out.println("Fent una pizza... ");
			for(String ingredient:pizza.getIngredients()) {
				System.out.print(ingredient+";");
			}
			System.out.println("Cost: "+pizza.getCost());
			totalcost=totalcost+pizza.getCost();
		}
		System.out.println("Total comanda: "+totalcost);
	}
}
