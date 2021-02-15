public class Fibonacci extends ThreadSubscriber{
    String input;
    @Override
    public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("Result of Fibonacci series at "+input+": "+execute());
    }
    @Override
    public String execute() {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int n = Integer.parseInt(input);
        if(n<=1)
            sum = n;
        for(int i=1 ; i < n ; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        String str = String.valueOf(sum);

        return str;
    }
}