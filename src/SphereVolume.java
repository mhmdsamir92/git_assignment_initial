
public class SphereVolume implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);
		double volume = (4/3) * (3.14) * (r*r*r);
		System.out.println("Hello, I am really a simple subscriber and I am notified with " + volume);
		

	}

}
