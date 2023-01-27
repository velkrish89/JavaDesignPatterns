package CreationDesignPatterns.AbstractFactory;

public class MountainBikeHandlebar extends Handlebar {

	private static final String type = "FLAT";

	@Override
	public void getDescription() {
		System.out.println("Mountain bike handlebar type: " + type);

	}

}
