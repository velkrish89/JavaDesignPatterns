package StructuralDesignPatterns.Bridge;

public class MediumButtonSize implements ButtonSize{

	@Override
	public void getSize() {
		System.out.println("Setting the size to medium...");
	
	}

}
