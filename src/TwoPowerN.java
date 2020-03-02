public class TwoPowerN implements ISubscriber{

    //20170053
    @Override
    public void notifySubscriber(String input) {
        int n = Integer.parseInt(input);
        int sum = 1;
        for(int i=0;i<n;i++){
            sum *= 2;
        }
        System.out.println("2 Power " + n + " equals " + sum);
    }
}
