package inheritance;

public class Computer {
	//Variables
	private double cpuSpeed;
	
	//Constructor
	public Computer() {
		cpuSpeed = 0;
	}
	
	//Methods
	public void setCpuSpeed(double speed) {
		cpuSpeed = speed;
	}
	
	public double getCpuSpeed() {
		return cpuSpeed;
	}
}
