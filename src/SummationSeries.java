public class SummationSeries implements ISubscriber
{
    @Override
    public void notifySubscriber(String input)
    {
        Integer v = Integer.valueOf(input);
        System.out.println(" Summation Series = " + (v*(v+1))/2 );
    }
}
