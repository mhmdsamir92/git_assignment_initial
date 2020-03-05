
public class CircleArea implements ISubscriber {

    @Override
    public void notifySubscriber(int input) {
        System.out.println("Hello, I am Circle Area and I am notified with " + input);

        int radius = input;
        if (radius < 0) {
            System.out.println("Radius is negative.");
            return;
        }

        System.out.println("Radius is " + radius + ",  Area is: " + calculat(radius));
    }

    public double calculat(int input) {
        return Math.PI * input * input;
    }
}
