
public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        double radius = Double.parseDouble ( input );
        double volume =((double)4/3) * Math.PI * Math.pow(radius,3) ;
        System.out.println("Sphere Volume is : " + volume);
    }
}
