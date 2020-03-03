
public class SphereArea extends ThreadSubscriber{

	String input;
	@Override
	public void notifySubscriber() {
		input = topic.getInput();
		System.out.println("Sphere Area = " + execute());
	}

	@Override
	public String execute() {
		double n = Integer.parseInt(input);
		double pi = 3.14;
		double sphereArea = 4 * pi * n * n;
		return String.valueOf(sphereArea);
	}
	
	
}
