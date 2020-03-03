public class CircleVolume extends DoubleSubscriber {
	@Override
    public void preProcess(int input) throws Exception {
        System.out.print("Hello, I'm CircleVolume, and I'm notified with: " + input + " as radius. ");
        if (input < 0) throw new Exception("Negative radius is invalid!");
    }

    public double doCalculation(int input) {
        return (4.0 / 3.0) * Math.PI * Math.pow(input, 3);
    }

    @Override
    public void printAnswer(double output) {
        System.out.println("Circle Volume is: " + output);
    }

}
