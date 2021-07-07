
public class sphereAreaSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(int r) {
		double area = 4* Math.PI *r * r;
		System.out.println("Sphere Area =  "+ area);
	}

}
