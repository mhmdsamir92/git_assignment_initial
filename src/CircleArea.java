public class CircleArea  implements ISubscriber {

    public static double getArea(double radius){
        return Math.PI * radius * radius;
    }

    @Override
    public void notifySubscriber(String input) {
        System.out.println("The area of the circle whose radius is" + Double.parseDouble(input) + " equals " + getArea(Double.parseDouble(input)));
    }
}
