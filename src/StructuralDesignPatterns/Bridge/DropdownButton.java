package StructuralDesignPatterns.Bridge;

public class DropdownButton extends Button {
	
	ButtonSize buttonSize;
	
	public DropdownButton(ButtonSize buttonSize) {
		this.buttonSize = buttonSize;
	}

	@Override
	void draw() {
		buttonSize.getSize();
		System.out.println("Drawing a dropdown button.");

	}

}
