
public class MultiplicationSeries implements ISubscriber  {

	@Override
	public void notifySubscriber(String input) {
		int output=1;
		for (int i = 1; i <= Integer.parseInt(input); i++) {
			output*=i;
		}
		System.out.println("MultiplicationSeries : " +output);
	}

}
