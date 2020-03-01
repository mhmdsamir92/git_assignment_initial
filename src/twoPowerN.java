public class twoPowerN implements ISubscriber{

    @Override
    public void notifySubscriber(String input) {
        long num = Long.parseLong(input);
            long res = 1;
        System.out.println(res << num);
    }

}
