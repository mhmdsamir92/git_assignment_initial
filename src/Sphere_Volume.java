public class Sphere_Volume implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		double radius = Double.parseDouble(input);
		double Sphere_volume = (4/3) * Math.PI * Math.pow(radius, 3);
		System.out.println("Sphere_volume = " + Sphere_volume);
	}
}

