

public class BallVolume extends ThreadSubscriber {

    String in;
    @Override
    public void notifySubscriber() {
        in = topic.getInput();
        System.out.println("Ball Volume = " + execute());

    }

    @Override
    public String execute() {
        double PI = 3.14159265359;
        double diameter = Double.parseDouble(in);
        double res = (4.0/3.0) * PI * Math.pow(diameter, 3.0);
        return String.valueOf(res);
    }
}
