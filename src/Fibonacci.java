
 public class Fibonacci implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am really a simple subscriber and I am notified with " + input);
	}
  public int calcFibonacci(int n){
    int maxNumber = n; 
		 int previousNumber = 0;
		 int nextNumber = 1
     int sum;
      for (int i = 1; i = maxNumber; ++i)
	        {
	            // On each iteration, we are assigning second number
	           //   to the first number and assigning the sum of last two
	             // numbers to the second number
	      
	            sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
          return sum;
  }
}
