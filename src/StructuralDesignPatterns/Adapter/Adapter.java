package StructuralDesignPatterns.Adapter;

/**
 * If we want to use the existing class, but it doesn't fit into our hierarchy - Then we will use adapter
 *
 */
public class Adapter implements City{
	
	City city;
	
	public Adapter(AsianCity city) {
		this.city = city;
	}

	@Override
	public String getName() {

		return city.getName();
	}

	@Override
	public double getTemperature() {
		double temperature = city.getTemperature();
	    return temperature * 1.8 + 32;
	}

	@Override
	public String getTemperatureScale() {
		
		return "Fahrenheit";
	}

	@Override
	public boolean getHasWeatherWarning() {
		
		return city.getHasWeatherWarning();
	}

	@Override
	public void setHasWeatherWarning(boolean hasWeatherWarning) {
		city.setHasWeatherWarning(hasWeatherWarning);
		
	}

}
