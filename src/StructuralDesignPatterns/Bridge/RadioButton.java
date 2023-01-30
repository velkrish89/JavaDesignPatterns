package StructuralDesignPatterns.Bridge;

/**
 * 
 * When we have numerous hierarchies, our app get more complex and inflexible - So we use bridge design pattern
 * Her bridging the ButtonSize implementation to Button hierarchies.
 */
public class RadioButton extends Button {
	
	ButtonSize buttonSize;
	
	public RadioButton(ButtonSize buttonSize) {
		this.buttonSize = buttonSize;
	}


	@Override
	void draw() {
		buttonSize.getSize();
		System.out.println("Drawing a radio button.");

	}

}
