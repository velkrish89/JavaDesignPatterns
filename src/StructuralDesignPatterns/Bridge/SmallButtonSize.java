package StructuralDesignPatterns.Bridge;

public class SmallButtonSize implements ButtonSize {

	@Override
	public void getSize() {
		System.out.println("Setting the size to small...");

	}

}
