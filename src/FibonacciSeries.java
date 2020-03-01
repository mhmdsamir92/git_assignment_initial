public class FibonacciSeries implements ISubscriber
{
    public  void notifySubscriber(int input)
    {
        int result = fib(input);
        System.out.println("The result of fibonacci series is "+ result);
    }
    int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }


}
