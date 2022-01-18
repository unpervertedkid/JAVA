package oopbasics;

public class Instanceof {
	
	public static void checkNumber(Number val) {
		 if(val instanceof Integer) {
			 System.out.println("This is an integer");
		 }
		 if(val instanceof Double) {
			 System.out.println("This is a Double");
		 }
	}
}
