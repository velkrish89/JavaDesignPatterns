package StructuralDesignPatterns.Decorator;

import java.util.ArrayList;

/**
 * 
 * To add additional responsibilities to an object dynamically - we can use decorator design patter
 * We can use this when we need more flexibility than subclassing allows
 *
 */

public class PizzaDecoratorExtraCheese implements Pizza{
	
	private Pizza pizza;
	private ArrayList<String> toppings;
	
	public PizzaDecoratorExtraCheese(Pizza pizza) {
		this.pizza = pizza;
		toppings = pizza.getToppings();
		toppings.add("extra cheese");
	}

	@Override
	public ArrayList<String> getToppings() {
		return toppings;
	}

	@Override
	public String getName() {
		return pizza.getName();
	}

}
