import java.util.Scanner;

public class multiplicationSeries extends ThreadSubscriber{
    String input;
    @Override
    public void notifySubscriber() {
        input =topic.getInput();
        System.out.println("MultiplicationSeries = "+execute());
    }


    @Override
    public String execute() {
        int Number = Integer.parseInt(input);
        int result = 1 ;
        for (int i = 1; i <= Number; i++) {
            result *= i;
        }
        return String.valueOf(result);
    }
}
