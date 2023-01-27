package CreationDesignPatterns.Prototype;

public class Person implements Cloneable{
	
	private String name;
	
	public Person() {
		
	};
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};
	
	//This is to support hard copy
	@Override
	public Person clone() {
		
		try {
			return(Person) super.clone();
		} catch(CloneNotSupportedException e) {
			throw new AssertionError();
		}
		
	}

}
