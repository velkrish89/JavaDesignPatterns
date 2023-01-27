package CreationDesignPatterns.Prototype;

public class Rabbit implements Cloneable{
	
	public enum Breed{
		HIMALAYAN,
		AMERICAN,
		LIONHEAD,
		DUTCH
	}
	
	private int age;
	private Breed breed;
	private Person owner;
	
	
	public int getAge() {
		return age;
	}
	public Breed getBreed() {
		return breed;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	@Override
	public Rabbit clone() {
		
		try {
			Rabbit rabbit = (Rabbit) super.clone();
			rabbit.owner = owner.clone();
			return rabbit;
		} catch( CloneNotSupportedException e) {
			throw new AssertionError();
		}
		
	}

}
