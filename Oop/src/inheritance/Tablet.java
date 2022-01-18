package inheritance;

public class Tablet extends Computer{
	//Variables
	private double screenSize;
	
	//Constructor
	public Tablet() {
		screenSize = 0;
	}
	
	//Methods
	public void setScreenSize(double size) {
		screenSize = size;
	}
	
	public double getSreenSize() {
		return screenSize;

	}
}
