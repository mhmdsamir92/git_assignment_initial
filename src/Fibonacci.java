//Ahmed Idris
//ID: 20160330

public class Fibonacci implements ISubscriber {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    @Override
    public void notifySubscriber(String input) {
        System.out.print("The Fibonacci number is: " + fib(Integer.parseInt(input)));
    }
}
