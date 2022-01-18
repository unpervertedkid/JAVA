package interfaces;

public class Tablet implements Computer {

	@Override
	public String getDeviceType() {
		
		return "This is a tablet";
	}

	@Override
	public String getSpeed() {
		
		return "2.5 GHz";
	}

}
