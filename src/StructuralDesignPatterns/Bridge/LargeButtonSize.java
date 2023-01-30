package StructuralDesignPatterns.Bridge;

public class LargeButtonSize implements ButtonSize{

	@Override
	public void getSize() {
		System.out.println("Setting the size to large...");
		
	}

}
