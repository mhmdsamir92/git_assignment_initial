public class SphereCircumference extends DoubleSubscriber {
    @Override
    public void preProcess(int input) throws Exception {
        System.out.print("Hello, I'm SphereCircumference, and I'm notified with: " + input + " as radius. ");
        if (input < 0) throw new Exception("Negative radius is invalid!");
    }

    public double doCalculation(int input) {
        return 2 * Math.PI * input;
    }

    @Override
    public void printAnswer(double output) {
        System.out.println("Sphere Circumference is: " + output);
    }
}