public abstract class DoubleSubscriber implements ISubscriber {
    public void notifySubscriber(int input) throws Exception{
        preProcess(input);
        double ans = doCalculation(input);
        printAnswer(ans);
    }
    public abstract void preProcess(int input) throws Exception;
    public abstract double doCalculation(int input);
    public abstract void printAnswer(double output);
}
