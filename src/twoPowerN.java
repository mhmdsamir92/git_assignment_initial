public class twoPowerN implements ISubscriber
{
    @Override
    public void notifySubscriber(String input) 
    {	
    	Double x = Double.parseDouble(input);
    	Double result = Math.pow(2,x);
    	System.out.println("2 Power "+x+" = "+result );

    }
   
}
