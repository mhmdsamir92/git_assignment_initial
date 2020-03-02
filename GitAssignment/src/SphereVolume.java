
public class SphereVolume implements ISubscriber {
	// 20170072
<<<<<<< HEAD
	
=======
>>>>>>> 20289a3ff4cf567705eef301f1f1da4ec52242d1
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		int radius = Integer.valueOf(input);
		
		double PI = Math.acos(-1);
		double volume = (4.0/3.0) * PI * Math.pow(radius, 3);
		System.out.println( "Sphere Volume is: " + volume);
	}

}
