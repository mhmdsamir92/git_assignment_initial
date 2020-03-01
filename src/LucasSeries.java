public class LucasSeries implements ISubscriber {
    public static int lucas_series(int number) { 
        if (number == 0) 
            return 2; 
        if (number == 1) 
            return 1; 
        return lucas_series(number - 1) + lucas_series(number - 2); 
    } 

    @Override
    public void notifySubscriber(String input) {
       int Lenght = Integer.parseInt(input);
       System.out.println("Hello, I am really a simple Lucas series and I am notified with " + input);
       System.out.println("LUcas Number Is : "+lucas_series(Lenght));
    }
    
}
