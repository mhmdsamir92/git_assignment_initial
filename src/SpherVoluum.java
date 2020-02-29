public class SpherVoluum implements ISubscriber{
    @Override
    public void notifySubscriber(String input)
    {
        double r = Double.valueOf(input);
        double volum2 =((double)4/3) * Math.PI * Math.pow(r,3);
        System.out.printf("\nSphere Volum is : " + volum2+"\n");
    }
}
