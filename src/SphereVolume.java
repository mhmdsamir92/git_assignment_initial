public class SphereVolume implements ISubscriber
{
    @Override
    public void notifySubscriber(String radius)
    {
        double Result =0.0;
        Result = (Math.pow(Double.parseDouble(radius),3)*4/3*Math.PI); // pi = 22/7
        System.out.println("The Sphere Volume --> "+Result);
    }
}
