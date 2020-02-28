import java. lang. Math. *;

public class SphereVolum implements ISubscriber {
	
	public double sphereVolum(double radius) {
		double result = 0.0;
		result = (4.0/3.0) * Math.PI * Math.pow(radius, 3.0);
		return result;
	}
	
	
	@Override
	public void notifySubscriber(String input) {
		double radius = Double.parseDouble(input);
		if (radius >= 0)
			System.out.println("Sphere Volum = " + sphereVolum(radius));
		else 
			System.out.println("Error, Radius can't be a negative number");	
		
	}
	
}
