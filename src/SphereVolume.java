import java.lang.Math;
public class SphereVolume implements ISubscriber {

	private static double value = 4.0/3.0;
	

	
	public static void sphereVolume(int radius) {
		/*calculating the volume of a sphere requires two constant inputs and a variable one.
		
		1- (variable)a radius (which is given).
		2- (constant)Pi, which simply =  3.14 or 22/7.
		3- (constant)the value (4/3).
		
	        */

		 double volume = value*(Math.PI)*Math.pow(radius, 3); 
		 System.out.println("The volume of a sphere with a given Radius of " + radius + "cm = " + volume + " cubic meters.");
		 
		 
	}

	@Override
	public void notifySubscriber(int input) {
		sphereVolume(input);
	}



}
