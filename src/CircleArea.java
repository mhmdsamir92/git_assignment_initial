
public class CircleArea implements ISubscriber {
	
	public double area (double R)
	{
		double area1 = Math.PI * R * R ;
		return area1 ;
	}

	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);
		if (r>=0)
		{
			System.out.println("circle area is = " + area(r));
		}
		else 
			System.out.println("error");
			
		
	}
	

}
