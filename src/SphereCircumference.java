public class SphereCircumference implements ISubscriber {
	 @Override
	    public void notifySubscriber(String input){
	        double r = Integer.parseInt(input);
	        System.out.println ("Circumference of a Sphere: "+2*Math.PI*r);
	    }

}
