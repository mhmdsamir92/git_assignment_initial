public class fibonacci implements ISubscriber{
    public void notifySubscriber(String input){
                System.out.println("Enter max number");

        Integer intinput = Integer.parseInt(input);
 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+intinput+" numbers:");
 	        System.out.print("Fibonacci Series of "+intinput+" numbers:");

	        for (int i = 1; i <= intinput; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }    }
}