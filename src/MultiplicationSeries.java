public class MultiplicationSeries implements IntegerSubscriber {

    @Override 
    public void preProcess(int input) {
        System.out.println("Hello, I'm MultiplicationSeries, and I'm notified with: " + input + " as input. ");
        if (input < 0) throw new Exception("Negative input is invalid!");
    }
    @Override
    public int doCalculation(int input) {
        int result = 1;
        for(int i=1; i<=input; i++){
            result = result*i;
        }
        return result;
    }
}
    @Override
    public void printAnswer(int output) {
        System.out.println("The Multiplication Series = " + output);
    }
