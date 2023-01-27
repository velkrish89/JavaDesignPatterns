package CreationDesignPatterns.AbstractFactory;

public class MountainBikeTire extends Tire {
	
	private static final String width = "WIDE"; 

	@Override
	public void getDescription() {
		System.out.println("Mountain bike tire width: " + width);
		
	}

}
