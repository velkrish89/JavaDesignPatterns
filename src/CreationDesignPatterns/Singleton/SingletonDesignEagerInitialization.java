package CreationDesignPatterns.Singleton;

/**
 * 
 * Singleton design pattern - Will create only one instance throughout the life time
 * restricts the instantiation
 * should contain private constructor, private static variable and public static method
 * 
 * Eager Initialization - This will create instance at the time of class loaded
 *
 *Example: java.lang.Runtime
 */

public class SingletonDesignEagerInitialization {
	
	//Private Constructor
	private SingletonDesignEagerInitialization() {
		
	}
	
	//Private static final variable
	private static final SingletonDesignEagerInitialization instance = new SingletonDesignEagerInitialization();
	
	//Public static method
	public static SingletonDesignEagerInitialization getInstance() {
		return instance;
	}

}
