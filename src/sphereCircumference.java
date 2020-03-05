
public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Sphere Circumference  = "+Integer.parseInt(input)*2*3.14159265359);
    }
}
