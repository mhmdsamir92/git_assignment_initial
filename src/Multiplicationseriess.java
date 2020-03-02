public class Multiplicationseriess implements ISubscriber {
    public int m(String n){
        int result = 1;
        int x = Integer.parseInt(n);
        for(int i=0; i<=x; i++){
            result = result*i;
        }
        return result;
    }
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Hello, I am really a simple subscriber and I am notified with " + input);
        System.out.println("and my result is : " + m(input));
    }
}
