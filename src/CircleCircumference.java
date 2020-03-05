public class CircleCircumference implements ISubscriber {

    @Override
    public void notifySubscriber(int input) {
        // TODO Auto-generated method stub
        System.out.println("Hello, I am CircleCircumference subscriber and I am notified with " + input);
        display(input);
    }

    void display(int input) { // accept input and check if valid or not then call get_CircleCircumference and display the result.
        double radius = 0;
        try { //check if the input can converted to double or not ..
            radius = input; // convert input String to double.
        } catch (NumberFormatException e) {
            System.out.println(" invalid input ");
            System.out.println("  " + e.getMessage());
            return;
        }
        double circumference = get_CircleCircumference(radius);
        System.out.println(" Circumference of a Circle = " + circumference);
    }

    double get_CircleCircumference(double radius) { //calc CircleCircumference.
        double circumference;
        circumference = 2 * Math.PI * radius;
        return circumference;
    }


}
