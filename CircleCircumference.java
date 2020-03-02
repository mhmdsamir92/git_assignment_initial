public class CircleCircumference implements ISubscriber{
    @Override
    public void notifySubscriber(String input){
        double radius = Integer.parseInt(input);
        System.out.println ("CircleCircumference: "+2*Math.PI*radius);
    }
}
