public class CircleArea implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        Double radius = Double.parseDouble(input);
        System.out.println("The area of the circle is :"+3.14*radius*radius);
    }
}
