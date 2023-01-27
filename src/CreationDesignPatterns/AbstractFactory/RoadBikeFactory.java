package CreationDesignPatterns.AbstractFactory;

public class RoadBikeFactory extends BikeFactory {

	@Override
	BikePart create(String partType) {
		
		if(partType.equalsIgnoreCase("Tire")) {
			return new RoadBikeTire();
		} else if (partType.equalsIgnoreCase("Handlebar")) {
			return new RoadBikeHandlebar();
		} else {
			System.out.println("Please enter valid bike part type");
			return null;
		}
	}

//	@Override
//	Tire createTire() {
//		return new RoadBikeTire();
//	}
//
//	@Override
//	Handlebar createHandlebar() {
//
//		return new RoadBikeHandlebar();
//	}

}
