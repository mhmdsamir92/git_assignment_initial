# git_assignment_initial


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ahmed farag
 */
public class CircleCircumference implements ISubscriber {

    void CalculateCircleCircumference (float radius)
    {
        radius=0;
        Scanner inbut=new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        radius=inbut.nextFloat();
        double circlecircumference=0;
        circlecircumference=2*(3.14)*radius;
        System.out.print("Circle Cumference Equal = "+circlecircumference);
    }
     @Override
    public void notifySubscriber(float input)
    {
        System.out.println("The result of Lucas Series is " + CalculateCircleCircumference (input));
    }

    
}
