
public class MultiplicationSeries implements ISubscriber {



	@Override

	public void notifySubscriber(String input) {

		int x = Integer.parseInt(input);

		System.out.println("Hello i'm a Multiplication Series subscriber and "

				+ "i'm notified with " + input);

		

	}



}
