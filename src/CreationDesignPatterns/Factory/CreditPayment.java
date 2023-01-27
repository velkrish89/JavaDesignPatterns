package CreationDesignPatterns.Factory;

public class CreditPayment extends Payment{
	
	private String id;
	private String type;

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getType() {
		return this.type;
	}

}
