import java.math.BigDecimal;

public class MultiplicationSeries implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		BigDecimal output=new BigDecimal("1");
		for (int i = Integer.parseInt(input); i > 0; i--) {
			output=output.multiply(BigDecimal.valueOf(i));
		}
		System.out.println("MultiplicationSeries : "+output);
	}

}
