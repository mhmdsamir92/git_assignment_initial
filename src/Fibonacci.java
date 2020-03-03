
public class Fibonacci implements ISubscriber{
	static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		
	}
}
