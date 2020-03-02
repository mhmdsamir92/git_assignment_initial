
public class SphereArea implements ISubscriber{

	@Override
	public void notifySubscriber(String input) {
		double n = Integer.parseInt(input);
		if(n < 0) {
			System.out.println("error number is negative.");
		}
		
		double pi = 3.14;
		double sphereArea = 4 * pi * n * n;
		System.out.println("Area of the Sphere = " + sphereArea);
	}
	
	
}
