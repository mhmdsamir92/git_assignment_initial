public class SummationSeries extends ThreadSubscriber {
    String input;
    @Override
    public void notifySubscriber() {
        input = topic.getInput();
        System.out.println("SummationSeries = " + execute());
    }

    @Override
    public String execute() {
        int in = Integer.parseInt(input);
        int res = in * (in + 1) / 2;
        return String.valueOf(res);
    }
}
