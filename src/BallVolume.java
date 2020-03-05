/**
 *
 * @author Eman Ayman Khalaf 20170067
 */
import java.util.Scanner;

public class BallVolume implements ISubscriber {

    public  BallVolume(){

    }

    @Override
    public void notifySubscriber(String input) {
        int radius= Integer.parseInt(input);
        double pie=3.14285714286;
        double volume=(4.0/3.0)*pie*(radius*radius*radius); // the volume of ball
        System.out.println("Volume of the sphere="+volume);
    }

}

