package src;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers[] = {

            new CircleArea(),
            new CircleVolum(),
            new SphereArea(),
            new fibonnachi_series(),
            new MultiplicationSeries(),
            new SphereVolume(),
            new SummationSeries(),
            new twoPowerN()


    };

    public static void main(String[] args) {
        System.out.println("1-Execute all functions\n2-Circle Area\n3-Circle Voulme\n4-SphereArea\n5-Fibonacci\n6-MultiplicationSeries\n7-SphereVolume\n8-SummationSeries\n9-2PowerN");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        int Choice=sc.nextInt();
        System.out.println("Enter The input number:");
        String input = sc.next();

        switch (Choice){
            case 1:
                Topic mathTopic = new Topic();
                for (ISubscriber sub : subscribers) {
                    mathTopic.addSubscriber(sub);
                }
                mathTopic.dispatchEvent(input);
                break;
            case 2:
                new CircleArea().notifySubscriber(input);
                break;
            case 3:
                new CircleVolum().notifySubscriber(input);
                break;
            case 4:
                new SphereArea().notifySubscriber(input);
                break;
            case 5:
                new fibonnachi_series().notifySubscriber(input);
                break;
            case 6:
                new MultiplicationSeries().notifySubscriber(input);
                break;
            case 7:
                new SphereVolume().notifySubscriber(input);
                break;
            case 8:
                new SummationSeries().notifySubscriber(input);
                break;
            case 9:
                new twoPowerN();
                break;
            default:
                break;
        }



    }
}
