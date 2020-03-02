public class MultiplicationSeries implements ISubscriber {

    public int m(String n) {
        int x = Integer.parseInt(n);
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    @Override
    public void notifySubscriber(String input) {
        System.out.print("Hello,I am a multiplication series and  I am notified with" + input);
        System.out.print("and my result is : " + m(input));
    }
}