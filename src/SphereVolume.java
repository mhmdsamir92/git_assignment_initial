/**
 *
 * @author Eman Ayman Khalaf
 */
import java.util.Scanner;

public class SphereVolume implements ISubscriber {

public  SphereVolume(){

}

    @Override
    public void notifySubscriber(String input) {
        int radius= Integer.parseInt(input);
        double pie=3.14285714286;
        double volume=(4.0/3.0)*pie*(radius*radius*radius);
        System.out.println("Volume of the sphere="+volume);
    }

    }

