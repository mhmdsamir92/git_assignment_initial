
public class CircleArea implements ISubscriber{
	
	@Override
	public void notifySubscriber(String input) {
		double reduis=Double.parseDouble(input);
		System.out.println("Circle Area = "+area(reduis));
		
	}
	

	public double area(double reduis) {
		double setArea=Math.PI * reduis *reduis;
		return setArea;
	}
}

