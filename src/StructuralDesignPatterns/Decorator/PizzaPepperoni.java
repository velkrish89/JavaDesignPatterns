package StructuralDesignPatterns.Decorator;

import java.util.ArrayList;

public class PizzaPepperoni implements Pizza {

	private ArrayList<String> toppings = new ArrayList<>();
	private String name = "Pepperoni";
	
	public PizzaPepperoni() {
		toppings.add("cheese");
	    toppings.add("tomato");	
	    toppings.add("pepperoni");
	}

	@Override
	public ArrayList<String> getToppings() {
		return toppings;
	}

	@Override
	public String getName() {
		return name;
	}
}
