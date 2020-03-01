public class SummationSeries implements ISubscriber
{ 
    public SummationSeries() {
}

    int factorial(int t)
    {
        int mul = 1;
        
        while(t > 0)
        {
            mul = mul * t;
            
            t--;
        }
        return mul;
    }
   
   
    
    @Override
    public void notifySubscriber(String input) 
    {
        double y = 0;
        int x=Integer.parseInt(input);

        SummationSeries mSummationSeries = new SummationSeries();
        for(int i = 1; i <= x; i++)
        {
            y = y + (double)i / (mSummationSeries.factorial(i));
        }
        System.out.println("Summation Series: "+y);
    }
   
}