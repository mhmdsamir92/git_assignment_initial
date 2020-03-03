
public class Fibonacci implements ISubscriber {
   @Override
   
   public  void notifySubscriber(String input) {
       int n = Integer.parseInt(input);
     int num1 = 0, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        System.out.print("Fibonacci Series of "+n+" numbers:");

        int i=1;
        while(i<=n)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
   }
}
