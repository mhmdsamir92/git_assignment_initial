
public class CircleVolume implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double radius = Double.parseDouble(input);
		double Volume = (4.0/3.0) * (22.0/7.0) * Math.pow(radius, 3);
		System.out.println("The Volume of the Ball is : " + Volume);
	}

}
