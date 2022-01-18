package overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age age1 = new Age(21.5);
		Age age2 = new Age(9,11);
		
		System.out.println("Age 1: " + age1.getAge());
		System.out.println("Age : " + age2.getAge());
	}

}
