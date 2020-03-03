public class SummationSeries implements ISubscriber {

    @Override
    public void notifySubscriber(int input) {
        int sum = (input * (input + 1)) / 2;
        System.out.println("The summation of series = " + sum);

    }

}
