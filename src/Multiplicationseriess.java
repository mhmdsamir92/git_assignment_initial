public class Multiplicationseriess implements ISubscriber {
    public int m(int n){
        int result = 1;
        for(int i=0; i<=n; i++){
            result = result*i;
        }
        return result;
    }
    @Override
    public void notifySubscriber(int input) {
        System.out.println("Hello, I am really a simple subscriber and I am notified with " + input);
        System.out.println("and my result is : " + m(input));
    }
}
