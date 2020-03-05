public class summtionSeries implements ISubscriber {
    public void notifySubscriber(String input){
        int x = Integer.parseInt(input);
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        system.out.println(sum);
        //20160152 ali osama ali

    }
}
