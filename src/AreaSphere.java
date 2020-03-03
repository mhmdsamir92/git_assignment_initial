/*
======================================================
Description : A class calculate the area of sphere.
Author      : Shrouk Nady Taha
Version     : 1.0
ID          : 20170128
Group       : IS_2
======================================================
*/

public class AreaSphere implements ISubscriber {

    public static double sphereArea(String radius)
    {
		double PI = Math.PI ;
        return ( 4 * PI * Integer.parseInt(radius) * Integer.parseInt(radius) ) ;	
    }
    public void notifySubscriber(String input)
    {
    	System.out.println("The area of the sphere is: " + sphereArea(input));
    }
}
