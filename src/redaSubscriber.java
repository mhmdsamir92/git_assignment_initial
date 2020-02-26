import java.lang.Math.*;
public class redaSubsriber implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Hello, I am a reda subscriber and I am notified with sphere radius :  " + 4/3 *Math.PI*Double.parseDouble(input) );
    
    }
}
