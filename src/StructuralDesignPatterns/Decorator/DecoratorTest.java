package StructuralDesignPatterns.Decorator;

public class DecoratorTest {

	public static void main(String[] args) {

		Order(new PizzaHawaiian());
		Order(new PizzaMargherita());
		Order(new PizzaPepperoni());
		
		//Decorator - extra cheese
		Order(new PizzaDecoratorExtraCheese(new PizzaHawaiian()));

	}
	
	public static void Order(Pizza pizza) {
		System.out.println("You have ordered a " + pizza.getName() + 
				" pizza. The toppings are " + pizza.getToppings());
	}

}
