package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablet myTab = new Tablet();
		myTab.setCpuSpeed(2.5);
		myTab.setScreenSize(10);
		System.out.println("Cpu speed: " + myTab.getCpuSpeed() + "Hz");
		System.out.println("Screen size: " + myTab.getSreenSize() + " inches.");
	}

}
