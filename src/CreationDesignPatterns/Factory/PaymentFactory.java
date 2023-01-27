package CreationDesignPatterns.Factory;

/**
 * Factory Design pattern - used when multiple subclasses for single super class
 * return any type of sub class
 * 
 * Why? - This provides code for interface instead of code for implementation
 * How? - Inheritance
 * Example: java.util.Calendar - NumberFormat - getInstance
 * 			Boolean, Integer - valueOf
 * 			SessionFactoryBean, EntityManagerFactoryBean
 * 
 * Factory - is a place where we generate objects
 */
public class PaymentFactory {
	
	public static Payment getPayment(String id, String type) {
		if("Debit".equalsIgnoreCase(type)) return new DebitPayment();
		else if("Credit".equalsIgnoreCase(type)) return new CreditPayment();
		return null;
	}

}
