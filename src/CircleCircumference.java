import java.util.Scanner;

public class CircleCircumference extends DoubleSubscriber {
    
    @Override
    public void preProcess(int input) throws Exception {
        System.out.print("Hello, I'm CircleCircumference, and I'm notified with: " + input + " as radius. ");
        if (input < 0) throw new Exception("Negative radius is invalid!"); }

    @Override
    public double doCalculation(int input) {
       return 2 * Math.PI * input;
    }

    @Override
    public void printAnswer(double output) {
       System.out.println("Circle Circumference is: " + output);
   }     

}
