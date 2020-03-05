public class CircleCircumference implements ISubscriber {
    
	public void notifySubscriber(String input) {
            double radius=Double.parseDouble(input);
		    //System.out.println("Hello, I am really a simple subscriber and I am notified with " + input);
            double circumference= Math.PI * 2*radius;
            System.out.println( "The circumference of this circle is: "+circumference) ;
    }
}