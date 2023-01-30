package StructuralDesignPatterns.Decorator;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza {

	private ArrayList<String> toppings = new ArrayList<>();
	private String name = "Margherita";
	
	public PizzaMargherita() {
		toppings.add("cheese");
	    toppings.add("tomato");		
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
