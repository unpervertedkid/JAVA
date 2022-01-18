package finalClassesAndMethods;

public class Temperature {
	
	//Variables
	private double t = 25;
	
	//Constructors
	public Temperature() {
		
	}
	public Temperature(double temperature) {
		t = temperature;
	}
	
	//Methods
	public double getCelcius() {
		return t;
	}
	//Final Method
	final public double getFahrenheit() {
		return t * 9/5 + 32;
	}
}
