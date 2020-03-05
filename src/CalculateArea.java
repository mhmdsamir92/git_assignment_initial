/*
 ============================================================================
 Description : A class contain a method to calculate the area of the circle.
 Author      : Omar Ashraf Labib Hassan
 Version     : 1.0
 ID          : 20170363
 Group       : CS_4
 ============================================================================
*/
public class CalculateArea implements ISubscriber
{
	
	
	public static double CircleArea(String radious)
	{
		double PI = Math.PI;
		return PI * Math.pow(Integer.parseInt(radious), 2);
	}
	@Override
	public void notifySubscriber(String input) 
	{
		System.out.println("The area of the circle is: " + CircleArea(input));
		
	}

}