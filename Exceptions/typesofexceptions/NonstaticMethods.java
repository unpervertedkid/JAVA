package typesofexceptions;

public class NonstaticMethods {
	
	//A static method
	public static void staticMethod() {
		System.out.println("This is a static method, accesible from a null object");
	}
	
	//A non static method
		public  void nonstaticMethod() {
			System.out.println("This is a non static method, accesible from a null object");
		}
	
	public static void main(String[] args) {
		
		NonstaticMethods object = null;
		
		//Calling the static method
		object.staticMethod();
		
		//Calling the non static method(Commented out)
		//object.nonstaticMethod();

	}

}
