package CreationDesignPatterns.AbstractFactory;

public class FactoryCreator {
	
	public static BikeFactory createFactory(String type) {
		if(type.equalsIgnoreCase("Road Bike")) {
			return new RoadBikeFactory();
		} else if(type.equalsIgnoreCase("Mountain Bike")) {
			return new MountainBikeFactory();
		} else {
			System.out.println("Please enter valid type");
			return null;
		}
	}

}
