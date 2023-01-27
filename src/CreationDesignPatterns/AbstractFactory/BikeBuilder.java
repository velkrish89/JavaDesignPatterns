package CreationDesignPatterns.AbstractFactory;

public class BikeBuilder {
	
	public static void main(String[] args) {
		
		createBike("Mountain Bike");
	}
	
	
	public static void createBike(String type) {
		BikeFactory bikeFactory = FactoryCreator.createFactory(type);
//		Tire tire = bikeFactory.createTire();
//		tire.getDescription();
//		
//		Handlebar handlebar = bikeFactory.createHandlebar();
//		handlebar.getDescription();
		
		Tire tire = (Tire) bikeFactory.create("Tire");
		tire.getDescription();
		
		Handlebar handlebar = (Handlebar) bikeFactory.create("Handlebar");
		handlebar.getDescription();		
	
	}

}
