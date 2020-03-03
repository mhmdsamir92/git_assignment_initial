public class SummationSeries extends IntegerSubscriber {

	@Override
	public void preProcess(int input) throws Exception {
		System.out.print("Hello, I'm SummationSeries, and I'm notified with: " + input + " as input. ");
        if (input < 0) throw new Exception("Negative input is invalid!");
    }

	@Override
	public int doCalculation(int input) {
		return (input * (input + 1)) / 2;
	}

	@Override
	public void printAnswer(int output) {
		System.out.println("The Summation Series = " + output);
	}

}
