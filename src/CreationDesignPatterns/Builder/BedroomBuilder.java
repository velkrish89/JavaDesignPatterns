package CreationDesignPatterns.Builder;

import java.awt.Color;
import java.awt.Dimension;

/**
 * Builder design payment
 * Where - object is heavy and complex, object has lot of parameters
 * Why? - Solve inconsistent of the object
 * How? - Create static inner class with Constructor full of parameters or with optional parameters
 * 		- Create methods to set value for each parameter
 * 		- Create a public build() method 
 *
 */
public class BedroomBuilder {
	
	private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;
    
    public BedroomBuilder() {
		
	}
    
    public BedroomBuilder setDimensions(Dimension dimensions) {
    	this.dimensions = dimensions;
    	return this;
    }
    
    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
    	this.ceilingHeight = ceilingHeight;
    	return this;
    }

    public BedroomBuilder setFloorNumber(int floorNumber) {
    	this.floorNumber = floorNumber;
    	return this;
    }
    
    public BedroomBuilder setWallColor(Color wallColor) {
    	this.wallColor = wallColor;
    	return this;
    }
    
    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
    	this.numberOfWindows = numberOfWindows;
    	return this;
    }
    
    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
    	this.numberOfDoors = numberOfDoors;
    	return this;
    }
    
    public BedroomBuilder setIDouble(boolean isDouble) {
    	this.isDouble = isDouble;
    	return this;
    }
    
    public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
    	this.hasEnsuite = hasEnsuite;
    	return this;
    }
    
    public Bedroom build() {
    	return new Bedroom(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, 
    			numberOfDoors, isDouble, hasEnsuite);
    }

}
