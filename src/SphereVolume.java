import java.lang.Math;

public class SphereVolume implements ISubscriber {
    private double radius;
    private double volume;

    public  SphereVolume(){radius = 0; volume = 0;}

    @Override
    public void notifySubscriber(String input) {
        radius = Double.parseDouble(input);
        volume = ((double)4 / 3) * 3.14 *  Math.pow(radius, 3);

        System.out.print("The SphereVolume = ");
        System.out.println(volume);
    }
}
