


public class Shperevolume implements ISubscriber {

	public void notifySubscriber(String input) {

		double redius=Integer.parseInt(input);


		double volume = (4*22*redius*redius*redius)/(3*7);
		System.out.println(volume);
	}

}
