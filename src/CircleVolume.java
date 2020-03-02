
public class CircleVolume implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		int radius = Integer.parseInt(input);
		double CircleVolume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		System.out.println("The Volume of the Circle is : " + CircleVolume);
	}

}
