import java.lang.Math;
public class SphereVolume implements ISubscriber {

	private static double value = 4.0/3.0;
	

	
	public static void sphereVolume(int diameter) {
		/*calculating the volume of a sphere requires two constant inputs and a variable one.
		
		1- (variable)a radius (which can be calculated from the given diameter).
		2- (constant)Pi, which simply =  3.14 or 22/7.
		3- (constant)the value (4/3).
		
	    */
		 int radius = diameter/2;
		 double volume = value*(Math.PI)*Math.pow(radius, 3); //  value;
		 System.out.println("The volume of a sphere with a given Diameter of " + diameter + "cm = " + volume + " cubic meters.");
		 
		 
	}

	@Override
	public void notifySubscriber(String input) {
		int value = Integer.parseInt(input);
		sphereVolume(value);
		
	}



}
