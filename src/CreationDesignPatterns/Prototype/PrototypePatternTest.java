package CreationDesignPatterns.Prototype;

public class PrototypePatternTest {

	public static void main(String[] args) {


		Rabbit rabbit = new Rabbit();
		rabbit.setAge(1);
		rabbit.setOwner(new Person("Jeevan"));
		Rabbit rabbitCopy = rabbit.clone();
		System.out.println("Age of rabbit: " + rabbit.getAge());
		System.out.println("Age of copy rabbit: " + rabbitCopy.getAge());
		System.out.println("Owner of rabbit: " + rabbit.getOwner().getName());
		System.out.println("Owner of copy rabbit: " + rabbitCopy.getOwner().getName());
		
		System.out.println("---------------- Owner Change on Rabbit----------------------");
		rabbit.getOwner().setName("Narthana");
		System.out.println("Owner of rabbit: " + rabbit.getOwner().getName());
		System.out.println("Owner of copy rabbit: " + rabbitCopy.getOwner().getName());
	}

}
