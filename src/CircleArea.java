
public class CircleArea implements ISubscriber {
	
	@Override
    public void notifySubscriber(String input) {
        System.out.println("Hello, I am Circle Area and I am notified with " + input);

        double radius;
        try {
            radius = Double.parseDouble(input);
            if (radius < 0) {
                System.out.println("Radius is negative.");
                return;
            }

        } catch (NumberFormatException ignored) {
            System.out.println("Radius is not a number.");
            return;
        }

        System.out.println("Radius is " + radius + ", Circle Area is: " + calculat(radius));
    }

    public double calculat(double input) {
        return  Math.PI * input *input;
    }
}
