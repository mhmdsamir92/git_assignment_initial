package src;
public class SphereVolume implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double radius = Double.parseDouble(input);
		double Volume = (4*22*radius*radius*radius) / (3*7);
		System.out.println("Volume=" + Volume);
	}
	
}	
	
