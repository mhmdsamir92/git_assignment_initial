
public class BallVolume implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		
                 double r=Double.parseDouble(input);
                 double  volume= (4*22*r*r*r)/(3*7);
 
                 System.out.println("Ball Volume is:" +volume);
	}

}
