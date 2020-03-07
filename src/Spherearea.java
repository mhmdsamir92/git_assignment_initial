package myPackage;

public class Spherearea implements ISubscriber{
	
	@Override
    public void notifySubscriber(String input) {
        double radius = Double.parseDouble(input);
        String result = String.valueOf(4*3.14*radius*radius);
        System.out.println("Sphere area = " + result);
    }
}


  