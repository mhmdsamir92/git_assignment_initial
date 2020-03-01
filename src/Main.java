import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
<<<<<<< HEAD
			 new LucasSeries(),
			
=======
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
		        new SphereCircumference(),
			new LucasSeries(),
>>>>>>> 29c1c0d4a9cd9b46a45857d712c860640f7aa7fd
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
