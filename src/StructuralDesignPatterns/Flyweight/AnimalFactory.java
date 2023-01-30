package StructuralDesignPatterns.Flyweight;

import java.util.HashMap;

/**
 * 
 * When - Hundreds of small object that use uploads of memory. Using flyweight pattern uses sharing to make these apps 
 * works efficiently 
 * Every time new object is created in PopulationSimulator class when executor runs and this might lead to java.lang.outOfMemory exception
 * By creating Animal factory class which will create objects only once and share those objects every time whenever 
 * executor runs.
 *
 */
public class AnimalFactory {
	
	HashMap<Integer, Animal> animals = new HashMap<>();
	
	public Animal getAnimal(int type) {
		if(animals.containsKey(type)) {
			return animals.get(type);
		} else {
			Animal animal = null;
			if(type == 0) {
				animal = new Lion();
			} else if(type == 1){
				animal = new Tiger();
			}
			animals.put(type, animal);
			return animal;	
		}
	}
	

}
