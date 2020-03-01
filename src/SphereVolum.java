public class SphereVolum implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        double volume =((double)4/3) * Math.PI * Math.pow((Double.parseDouble(input)),3) ;
        System.out.println("Sphere Volume is :  " + volume);
    }

}
