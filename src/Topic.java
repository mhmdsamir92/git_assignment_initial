import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	private List<ISubscriber> subscribers;
	
	public Topic() {
		subscribers = new ArrayList<ISubscriber>();
	}
	
	public void addSubscriber(ISubscriber sub) {
		subscribers.add(sub);
	}
	
	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}
	
	public void dispatchEvent(String input,int choice) {
		switch (choice) {
		case 1:
			this.subscribers.get(0).notifySubscriber(input);
			break;
		case 2:
			this.subscribers.get(1).notifySubscriber(input);
			break;
		case 3:
			this.subscribers.get(2).notifySubscriber(input);
			break;
		case 4:
			this.subscribers.get(3).notifySubscriber(input);
			break;
		case 5:
			this.subscribers.get(4).notifySubscriber(input);
			break;
		case 6:
			this.subscribers.get(5).notifySubscriber(input);
			break;
		case 7:
			this.subscribers.get(6).notifySubscriber(input);
			break;
		case 8:
			for (ISubscriber sub : this.getSubscribers()) {
				sub.notifySubscriber(input);
			}
			break;
		case 9:
			System.exit(0);
			break;
		default:
			System.out.println("wrong choice");
			break;
		}
		
	}
}
