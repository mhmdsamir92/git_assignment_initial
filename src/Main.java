
import java.util.Scanner;

public class Main {
	private static final ISubscriber subscribers [] = {
			new SimpleSubscriber(),

			new ReallySimpleSubscriber(),

			new CircleCircumference(),
			new SphereVolume(),
            new SummationSeries(),
            new MultiplicationSeries(),
			new CircleArea()

			
			



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

