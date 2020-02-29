
public class SphereArea implements ISubscriber{
	
	public SphereArea() {
		// TODO Auto-generated constructor stub
	}
	
	public void calcSphereArea(double r){
		double area = 4*3.14*(r*r);
		System.out.println(area);
	}

	@Override
	public void notifySubscriber(String input) {
		
		calcSphereArea(Integer.parseInt(input));
		
	}
}
