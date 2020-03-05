import java.lang.Math; 

public class TwoPowerN implements ISubscriber
{

	@Override
	public void notifySubscriber(String input)
	{
		
        double n= Double.parseDouble(input);
        
		System.out.println("2 power " + input  + " equals " + Math.pow(2,n));
	}

}
