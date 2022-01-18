package overloading;

public class Age {
	//Variables
	private double age = 0;
	
	//Constructors(Overloaded)
	public Age(double a) {
		age = a;
	}
	
	public Age(int year, int month) {
		age = year + (double) month/12;
	}
	
	//Methods
	public double getAge() {
		return age;
	}
}
