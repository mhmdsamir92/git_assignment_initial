import java.lang.Math; 

public class twoPowerN implements ISubscriber
{
    @Override
    public void notifySubscriber( String input ) 
    {
    	double result = 1;
    	
        double p = Double.parseDouble(input);
        result = Math.pow(2,p);
        System.out.println("2 Power "+p+" = "+result);
        
    }

}