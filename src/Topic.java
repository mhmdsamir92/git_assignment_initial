import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<ThreadSubscriber> subscribers;
    String input;

    public Topic() {
        subscribers = new ArrayList<ThreadSubscriber>();
    }

    public void addSubscriber(ThreadSubscriber sub) {
        subscribers.add(sub);
    }

    public List<ThreadSubscriber> getSubscribers() {
        return subscribers;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void dispatchEvent() {
        for (ThreadSubscriber sub : this.getSubscribers()) {
            sub.start();
        }
    }
}
