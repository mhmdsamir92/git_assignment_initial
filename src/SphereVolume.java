/*
 * 
 Description : Class to calculate the volume of a sphere given the radius
 Author      : Peter Rady Shehata
 ID          : 20080093
 Group       : CS_5
 *
 */

public class SphereVolume implements ISubscriber
{
	public static double CalcuateVolume(int radius)
	{
		return ((double)4 / 3) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public void notifySubscriber(String input) 
	{
		int radius = Integer.parseInt(input);
		System.out.format("%nThe volume of the sphere with radius: %d is %.2f%n", radius, CalcuateVolume(radius));
	}

}
