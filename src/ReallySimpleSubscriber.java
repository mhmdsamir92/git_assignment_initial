package SW2_git_assignment_CircleCircumference;


public class ReallySimpleSubscriber implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am really a simple subscriber and I am notified with " + input);
	}
}
