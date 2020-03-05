
public class SimpleSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Area of the circle = "+Integer.parseInt(input)*Integer.parseInt(input)*3.14159265359);
	}


}
