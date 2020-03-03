
import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			
			new SphereVolume(),
			new AreaSphere(),
			new LucasSeries(),
			new CalculateArea(),
			new Fibonacci(),	
			new CalcBallVolume()
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
					  "7-execute all\n"+
					  "8-terminate\n");
			choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				System.out.print("Enter input: ");
				input = sc.next();
				mathTopic.dispatchEvent(input);
				break;
			case 8:
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
