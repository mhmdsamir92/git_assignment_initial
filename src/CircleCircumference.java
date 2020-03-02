
public class CircleCircumference implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double r=Double.parseDouble(input);
		System.out.println("circle circumference = "+(2*3.14*r));
	}

}
