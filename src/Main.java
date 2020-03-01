import java.util.Scanner;

public class Main {
	//Array of all mathematical operations implemented
	//Please Create a new Object of your class in it
	private static ISubscriber subscribers [] = {
		new sphereAreaSubscriber(),
    new CircleArea(),
			new SummationSeries(),
			new LucasSeries()
	};
	public static void main(String[] args)
	{
		Topic mathTopic = new Topic();
		//Loop that adds every element in array to the private attribute 
		//subscribers[] in topic 
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
