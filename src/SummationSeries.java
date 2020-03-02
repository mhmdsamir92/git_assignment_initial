public class SummationSeries implements ISubscriber
{
    @Override
    public void notifySubscriber(String input)
    {
        int in = Integer.parseInt(input) ;
        System.out.println(" Summation Series = " + (in*(in+1))/2 );
    }
}
