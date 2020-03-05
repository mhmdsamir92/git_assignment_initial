import java.lang.*;
public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(int input) {
        // The circumference of the sphere = 2 * PI * r
        // the input will be the radius of the circle
        double circumference = 2  * Math.PI * (double)input;
        System.out.println("The circumference of the sphere = " + circumference);
    }
}
