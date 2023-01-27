package CreationDesignPatterns.Builder;

import java.awt.Color;
import java.awt.Dimension;

public class BedroomBuilderTest {

	public static void main(String[] args) {

		Bedroom room = new BedroomBuilder()
			.setDimensions(new Dimension(200, 100))
			.setCeilingHeight(500)
			.setFloorNumber(3)
			.setWallColor(Color.BLACK)
			.setNumberOfWindows(6)
			.setNumberOfDoors(2)
			.setIDouble(true)
			.build();
		
			

	}

}
