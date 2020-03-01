
public class SphereCircumference extends ThreadSubscriber implements ObserverTest  {
	
	 public void notifySubscriber(String input) {
	        double R = Double.parseDouble(input);
	        System.out.println("Sphere Circumference is  = " + (2*3.14*R));
	        
}
