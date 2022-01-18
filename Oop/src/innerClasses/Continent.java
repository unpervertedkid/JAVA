package innerClasses;

public class Continent {
	
	//Inner class
	private class Country {
		//Inner class Method
		public void print() {
			System.out.println("This a Africa, a 'country' inner class.");
		}
	}
	
	//Method to access inner class
	public void printContinent() {
		Country Africa = new Country();
		Africa.print();
		
	}
}
