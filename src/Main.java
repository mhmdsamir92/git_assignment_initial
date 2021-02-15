import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers[] = {
            new MultiplicationSeries(),
            new SummationSeries(),

            new CircleCircumference(),
            new CircleArea(),
            new CircleVolume(),

            new SphereCircumference(),
            new SphereArea(),
            new SphereVolume(),

            new Fibonacci(),
            new TwoPowerN(),
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) {
            mathTopic.addSubscriber(sub);
        }

        try {
            while (true) {


                for (int i = 0; i < subscribers.length; ++i) {
                    System.out.println((i + 1) + " - " + subscribers[i].getClass().getName());
                }
                System.out.println("0 - Run all functions");
                System.out.println("X - Exit application");

                System.out.println("Choose your option:");
                String input = sc.next();
                if (input.equals("X")) break;
                int choice = Integer.parseInt(input);

                System.out.println("Enter input number: ");
                int n = Integer.parseInt(sc.next());

                if (choice < 0 || choice > subscribers.length) throw new Exception("Invalid choice.");
                if (choice != 0)
                    subscribers[choice - 1].notifySubscriber(n);
                else
                    mathTopic.dispatchEvent(n);

            }
        } catch (NumberFormatException ignored) {
            System.out.println("Your input is not a valid integer.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}