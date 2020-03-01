
public class sphereAreaSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);
		double area = 4* Math.PI *r * r;
		System.out.println("Hello, I am really a simple subscriber and I am notified with "+ area);
	}

}
