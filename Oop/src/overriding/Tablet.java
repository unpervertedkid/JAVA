package overriding;

public class Tablet extends Computer{
	@Override
	public void whatIsIt() {
		System.out.println("This is a tablet.");
	}

}
