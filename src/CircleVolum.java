public class CircleVolum implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
       double r=Double.parseDouble(input),pi=22.0/7.0;
       double volume=(4.0/3.0)*pi*(r*r*r);
       System.out.println("Volume="+volume);

    }
}
