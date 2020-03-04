public class summtionSeries implements ISubscriber {
    public abstract void notifySubscriber(String input){
        int x = Integer.parseInt(input);
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += 1;
        }
        return sum;
        //20160152 ali osama ali

    }
}
