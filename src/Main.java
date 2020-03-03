import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers [] = {
            new MultiplicationSeries(),
            new CircleVolume(),
            new SphereCircumference(),
            new SphereVolume(),
            new CircleCircumference(),
            new SummationSeries(),
            new CircleArea(),
            new CircleVolume(),
            new TwoPowerN(),
            new SphereArea(),
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) {
            mathTopic.addSubscriber(sub);
        }

        try{
            for (int i = 0; i < subscribers.length; ++i) {
                System.out.println((i+1) + " - " + subscribers[i].getClass().getName());
            }
            System.out.println("0 - Run all functions");

            System.out.println("Choose your option:");
            int choice = Integer.parseInt(sc.next());

            System.out.println("Enter input number: ");
            int n = Integer.parseInt(sc.next());

            if (choice < 0 || choice > subscribers.length) throw new Exception("Invalid choice.");
            if (choice != 0)
                subscribers[choice-1].notifySubscriber(n);
            else
                mathTopic.dispatchEvent(n);
        }catch(NumberFormatException ignored) {
            System.out.println("Your input is not a valid integer.");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}