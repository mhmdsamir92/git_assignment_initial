import java.util.Scanner;

public class CircleArea implements ISubscriber
{
	@Override
	public void notifySubscriber(String input){
           int r = Integer.parseInt(input);
        double pi = 3.14, area;
        area = pi * r * r;
        System.out.println("Area of circle: "+ area);
        }
}