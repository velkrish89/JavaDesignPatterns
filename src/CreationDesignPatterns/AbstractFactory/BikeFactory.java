package CreationDesignPatterns.AbstractFactory;

public abstract class BikeFactory {
	
//	abstract Tire createTire();
//	
//	abstract Handlebar createHandlebar();
	
	abstract BikePart create(String partType);

}
