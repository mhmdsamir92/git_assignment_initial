
import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			
			new SphereVolume(),
			new AreaSphere(),
			new LucasSeries(),
			new CalculateArea(),
			new Fibonacci(),	
			new CalcBallVolume(),
			new power()
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		
		int choice;
		String input;
		while(true) 
		{
			System.out.print(
					  "1-SphereVolume\n" + 
					  "2-CircleVolume\n" +
					  "3-lucasSeries\n"+
					  "4-SphereArea\n"+
					  "5-CircleArea\n"+
					  "6-fibonacci\n"+
					  "7-power\n"+
					  "8-execute all\n"+
					  "9-terminate\n");
			choice = sc.nextInt();
			switch (choice) 
			{
			case 1: 
				System.out.print("Enter input: ");
				input = sc.next();
				SphereVolume sphereVolume = new SphereVolume();
				sphereVolume.notifySubscriber(input);
				break;
			case 2:
				System.out.print("Enter input: ");
				input = sc.next();
				CalcBallVolume calcBallVolume = new CalcBallVolume();
				calcBallVolume.notifySubscriber(input);
				break;
			case 3:
				System.out.print("Enter input: ");
				input = sc.next();
				LucasSeries lucasSeries = new LucasSeries();
				lucasSeries.notifySubscriber(input);
				break;
			case 4:
				System.out.print("Enter input: ");
				input = sc.next();
				AreaSphere areaSphere = new AreaSphere();
				areaSphere.notifySubscriber(input);
				break;
			case 5:
				System.out.print("Enter input: ");
				input = sc.next();
				CalculateArea calculateArea = new CalculateArea();
				calculateArea.notifySubscriber(input);
				break;
			case 6:
				System.out.print("Enter input: ");
				input = sc.next();
				Fibonacci fibonacci = new Fibonacci();
				fibonacci.notifySubscriber(input);
				break;
			case 7:
				System.out.print("Enter input: ");
				input = sc.next();
				power Power = new power();
				Power.notifySubscriber(input);
				break;
				
			case 8:
				System.out.print("Enter input: ");
				input = sc.next();
				mathTopic.dispatchEvent(input);
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
