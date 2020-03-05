
public class Sphere_Volume implements ISubscriber { 
	@Override
	public void notifySubscriber(String input) {
		
		double Radius = Double.parseDouble(input);
		if(Radius < 0)
		{
			System.out.println("Radius can not be equal nagative number");
		}
		else {
		double Volume = (4/3) * Math.PI * Math.pow(Radius, 3);
		System.out.println("Sphere Volume = "+ Volume);
		}
		
	}
}
