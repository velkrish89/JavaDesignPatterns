package StructuralDesignPatterns.Decorator;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza{
	
	private ArrayList<String> toppings = new ArrayList<>();
	private String name = "Hawaiian";
	
	public PizzaHawaiian() {
		toppings.add("cheese");
	    toppings.add("tomato");
	    toppings.add("ham");
	    toppings.add("pineapple");		
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
