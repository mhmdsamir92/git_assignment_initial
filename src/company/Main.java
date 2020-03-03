package company;

import java.util.Scanner;

public class Main {
	private static IntegerSubscriber subscribers [] = {
			new Fibonacci(),
	};
	public static void main(String[] args) throws Exception{
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt() ;
		mathTopic.dispatchEvent(input);
	}
}
