public abstract class IntegerSubscriber implements ISubscriber {
    public void notifySubscriber(int input) throws Exception {
        preProcess(input);
        int ans = doCalculation(input);
        printAnswer(ans);
    }

    public abstract void preProcess(int input) throws Exception;

    public abstract int doCalculation(int input);

    public abstract void printAnswer(int output);
}
