

public class CircleArea implements ISubscriber {

    
    @Override
	public void notifySubscriber(String input) {
                double pi = 3.14 , res;
                int r = Integer.parseInt(input);
                res = pi *(r*r);
		System.out.println("Area of circle:" + res );
	}
}
    

