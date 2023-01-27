package CreationDesignPatterns.Factory;

public abstract class Payment {
	
	public abstract String getId();
	
	public abstract String getType();
	
	public String toString() {
		return "Id " + getId() + " type " + getType();
	}

}
