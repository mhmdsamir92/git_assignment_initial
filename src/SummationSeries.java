package src;
/*
Name: Omar Khaled Ali
ID: 20170374
*/
public class SummationSeries implements ISubscriber {
    private int Sum (int num){
        int sum = 0;
        for(int i=1 ; i<=num ; i++){
            sum += i;
        }
        return sum;
    }

    @Override
    public void notifySubscriber(String input) {
        System.out.print("Hello, I am Summation series and I am notified with: " + input);
        System.out.println("result: " + Sum(Integer.parseInt(input)));
    }
}
