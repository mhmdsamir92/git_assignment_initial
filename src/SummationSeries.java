public class SummationSeries implements ISubscriber {
    @Override
    public void notifySubscriber(int input) {
        int sum = 0;
        for(int i=0; i<=input; i++)
            sum += i;
        System.out.println("Result : " + sum);
    }
}
