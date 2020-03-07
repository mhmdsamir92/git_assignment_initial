public class multiplicationSeries implements ISubscriber {
    public void notifySubscriber(String input) 
    {
	int number = Integer.parseInt(input);
        for(int i=1; i <= number; i++)
        {
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}
