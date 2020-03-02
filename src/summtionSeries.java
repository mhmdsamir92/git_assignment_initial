public class summtionSeries implements ISubscriber {
    public abstract void notifySubscriber(String input){
        int n = Integer.parseInt(input);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1;
        }
        return sum;

    }
}
