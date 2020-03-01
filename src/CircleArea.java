
public class CircleArea implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		double r = Integer.parseDouble(input);
		System.out.println("Circle Area : " + (r*r)*Math.PI );
	}
}    
}
