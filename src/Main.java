import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new TwoPowerN(),
			new Circle(),
			new Shperevolume(),
			new CircleCircumference(),
			new CircleVolum(),
			new Lucas(),
			new SphereArea(),
			new SphereCircumference(),
			new fibonacci()
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
