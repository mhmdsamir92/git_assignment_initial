import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
		new sphereAreaSubscriber(),
    	new CircleArea(),
		new SummationSeries(),
		new LucasSeries(),
    	new Fibonacci(),
		new sphereCircumferenceSubscriber(),
		new MultSer(),
		new CircleVolume(),
    	new SphereVolume(),
  	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		showList();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Enter value: ");
		String input = sc.next();
		sc.close();
		if(choice == 0) 
			mathTopic.dispatchEvent(input);
		else
			mathOP(input, choice - 1);
		
	}
	public static void showList(){
		String choices = "1-Sphere Area\n"
						+"2-Circle Area\n"
						+"3-SummationSeries\n"
						+"4-Lucas Series\n"
						+"5-Fibonacci\n"
						+"6-Sphere Circumference\n"
						+"7-Multiplication series\n"
						+"8-Circle Volume\n"
						+"9-Sphere Volume\n"
						+"0-For all\n";
		System.out.println(choices);
	}
	public static void mathOP(String input, int choice){
		subscribers[choice].notifySubscriber(input);
	}
}
