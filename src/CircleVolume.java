public class CircleVolume implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double r = Double.parseDouble(input);
		double Vol = (4/3) * Math.PI * r * r * r;
		System.out.println("Circle Volume is  "+ Vol);	}

}