/*
 OverView : A class calculates a multiplication series from 0 to N
 Author   : Lamya Raed Aly
 ID       : 20170399
 Group    : CS-4
 */

public class MultiplicationSeries implements ISubscriber {

    public int MultSeries(int N){
        int answer =1;
        for(int i=1; i<=N; i++){
            answer *= i;
        }
        return answer;
    }

    @Override
    public void notifySubscriber(String input) {
        System.out.print("Hello, I am a multiplication series and I am notified with " + input);
        System.out.println("and my result is : " + MultSeries(Integer.parseInt(input)));
    }
}
