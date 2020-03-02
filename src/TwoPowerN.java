public class TwoPowerN implements ISubscriber{
	@Override
    public void notifySubscriber(int N) {
        double result = Math.pow(2,  N);
        System.out.println("2 power " + N + " equals: " + result);
    }
}