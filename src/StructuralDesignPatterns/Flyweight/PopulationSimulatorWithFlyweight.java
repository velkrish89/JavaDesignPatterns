package StructuralDesignPatterns.Flyweight;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 
 * When - Hundreds of small object that use uploads of memory. Using flyweight pattern uses sharing to make these apps 
 * works efficiently 
 * Every time new object is created in PopulationSimulator class when executor runs and this might lead to java.lang.outOfMemory exception
 * By creating Animal factory class which will create objects only once and share those objects every time whenever 
 * executor runs.
 *Flyweight objects use to share the intrinsic state which is same for every time
 */
public class PopulationSimulatorWithFlyweight {
	static ArrayList<Animal> animals = new ArrayList<>();
	private static AnimalFactory animalFactory = new AnimalFactory();

	public static void main(String[] args) {

		Runnable createAnimals = new Runnable() {
			@Override
			public void run() {
				createAnimal();	
			}
		};
		
		Runnable removeAnimals = new Runnable() {
			
			@Override
			public void run() {
				removeAnimal();
			}
		};
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(createAnimals, 0, 3, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(removeAnimals, 5, 5, TimeUnit.SECONDS);

	}
	
	public static void createAnimal() {
		Random random = new Random();
		int type = random.nextInt(2);
		
		Animal animal = animalFactory.getAnimal(type);
		
		animal.setLocation(random.nextInt(1000), random.nextInt(1000));
		System.out.println("Creating an animal " + animal + ", type " + 
				animal.getAnimalType() + ", location: " + animal.getLocation()[0] + " " + animal.getLocation()[1]);
		
		animals.add(animal);
	}
	
	public static void removeAnimal() {
		System.out.println("Removing animal " + animals.get(0));
		animals.remove(0);
	}
}
