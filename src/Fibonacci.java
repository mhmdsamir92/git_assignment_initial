
 public class Fibonacci implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		int in = Integer.parseInt(input) ;
		int fib = calcFibonacci(in);
		System.out.println("Fibonacci: " + fib);
	}
  public int calcFibonacci(int n){
    int maxNumber = n; 
		 int previousNumber = 0;
		 int nextNumber = 1;
     int sum = 0;
      for (int i = 1; i < maxNumber; ++i)
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
