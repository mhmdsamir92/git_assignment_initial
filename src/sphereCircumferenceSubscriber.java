
public class sphereCircumferenceSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double r = Double.parseDouble(input);
		double circum = 2 * Math.PI * r;
		System.out.println("sphere circumference is  "+ circum);
	}

}
