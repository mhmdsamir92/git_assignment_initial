import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new Sphere_Volume(),
			//new CircleVolum(),
			new SummationSeries(),
			new SphereCircumference(),
			new SphereArea(),
			//new CircleArea(),
			new fibonacci()
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		int choice;
		String input;
		while(true) {
			System.out.print("1-SphereVolum 2-CircleVolum\n"
					+ "3-SummationSeries 4-SphereCircumference\n"
					+ "5-SphereArea 6-CircleArea\n"
					+ "7-fibonacci 8-excute all\n"
					+ "9-exit\n"
					+ "Choice: ");
			choice=sc.nextInt();
			switch (choice) {
			case 1:				
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.print("Enter ur input: ");
				input = sc.next();
				mathTopic.dispatchEvent(input,choice);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
			System.out.println();
		}
		
	}
}
