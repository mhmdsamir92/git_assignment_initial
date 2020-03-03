import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers [] = {
            new SimpleSubscriber(),
            new ReallySimpleSubscriber(),
            new MultiplicationSeries(),
            new LucasSeries(),
            new SphereVolume(),
            new BallVolume(),
	        new twoPowerN(),
	        new CircleCircumference(),
            new SphereArea(),
       new CircleArea()

            //please add your object here
    };
    public static void main(String[] args) {
        Topic mathTopic = new Topic();
        System.out.println("Enter 0 to execute all");
        System.out.println("1-SimpleSubscriber\n" +
                "2-ReallySimpleSubscriber\n3-MultiplicationSeries\n4-LucasSeries\n" +
                "5-SphereVolume\n6-BallVolume\n7-twoPowerN\n8-CircleCircumference\n9-SphereArea\n10-CircleArea");
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int c = choice.nextInt();
        if(c==0) {

            for (ISubscriber sub : subscribers) {
                mathTopic.addSubscriber(sub);
            }

        }
        else if(c==1)
        {
            mathTopic.addSubscriber(subscribers[0]);
        }
        else if(c==2)
        {
            mathTopic.addSubscriber(subscribers[1]);
        }
        else if(c==3)
        {
            mathTopic.addSubscriber(subscribers[2]);
        }
        else if(c==4)
        {
            mathTopic.addSubscriber(subscribers[3]);
        }
        else if(c==5)
        {
            mathTopic.addSubscriber(subscribers[4]);
        }
        else if(c==6)
        {
            mathTopic.addSubscriber(subscribers[5]);
        }
        else if(c==7)
        {
            mathTopic.addSubscriber(subscribers[6]);
        }
        else if(c==8) {
            mathTopic.addSubscriber(subscribers[7]);
        }
        else if (c==9){
            mathTopic.addSubscriber(subscribers[8]);
        }
	    else if (c==10){
            mathTopic.addSubscriber(subscribers[9]);
        }

        //please call your method as the above calls here


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String input = sc.next();
        mathTopic.dispatchEvent(input);

    }
}
