public class CircleArea implements ISubscriber{
	@Override
    public void notifySubscriber(double r) {
        double RSquare = Math.pow(r,  2);
        System.out.println("Circle area for a radius equals to " + r + " equals: " + ((3.14)*RSquare));
    }
}