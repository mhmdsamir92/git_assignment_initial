
public class TwoPowerN implements ISubscriber {
    @Override
    public void notifySubscriber(int input) {
        int p = input, res = 2;

        for (int i = 1; i < p; i++) {
            res += res;
        }

        System.out.println(res);
    }
}