public class SphereCircumference extends ThreadSubscriber{
    String input;
    @Override
    public void notifySubscriber() {
        input =topic.getInput();
        System.out.println("Sphere Circumference  = "+execute());
    }


    @Override
    public String execute() {
        double result = Double.parseDouble(input)*2*3.14159265359;
        return String.valueOf(result);
    }
}
