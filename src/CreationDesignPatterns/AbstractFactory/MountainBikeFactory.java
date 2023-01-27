package CreationDesignPatterns.AbstractFactory;

public class MountainBikeFactory extends BikeFactory {

	@Override
	BikePart create(String partType) {
		
		if(partType.equalsIgnoreCase("Tire")) {
			return new MountainBikeTire();
		} else if (partType.equalsIgnoreCase("Handlebar")) {
			return new MountainBikeHandlebar();
		} else {
			System.out.println("Please enter valid mountain bike part type");
			return null;
		}
	}


//	@Override
//	Tire createTire() {
//		return new MountainBikeTire();
//	}
//
//	@Override
//	Handlebar createHandlebar() {
//		return new MountainBikeHandlebar();
//	}

}
