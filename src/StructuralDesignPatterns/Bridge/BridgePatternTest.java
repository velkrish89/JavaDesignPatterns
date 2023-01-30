package StructuralDesignPatterns.Bridge;

public class BridgePatternTest {

	public static void main(String[] args) {

		CheckboxButton checkboxButton = new CheckboxButton(new MediumButtonSize());
		checkboxButton.draw();
		
		System.out.println(" ------------------------------ ");
		
		RadioButton radioButton = new RadioButton(new LargeButtonSize());
		radioButton.draw();
		
		System.out.println(" ------------------------------ ");
		
		DropdownButton dropdownButton = new DropdownButton(new SmallButtonSize());
		dropdownButton.draw();

	}

}
