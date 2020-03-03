package git.assignment;


import git.assignment.ReallySimpleSubscriber;
import git.assignment.Topic;
import git.assignment.Multiplicationseriess;
import git.assignment.SimpleSubscriber;
import git.assignment.ISubscriber;
import java.util.Scanner;

public class GitAssignment {
	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
                        new Multiplicationseriess(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		mathTopic.dispatchEvent(input);
               
	}
}
