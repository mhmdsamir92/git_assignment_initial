package src;

import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers[] = {
            new MultiplicationSeries(),
            new SphereVolume(),
            new CircleArea(),
            new CircleVolum(),
            new SphereArea(),
            new SummationSeries()

    };

    public static void main(String[] args) {
        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) {
            mathTopic.addSubscriber(sub);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        String input = sc.next();
        mathTopic.dispatchEvent(input);

    }
}
