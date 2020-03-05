
public class CircleCircumference implements ISubscriber {

    public CircleCircumference() { }
    @Override
	public void notifySubscriber(String input){
           double x= Double.parseDouble(input);
           double y=2*3.14*x;
            System.out.print("the circumference equals ");
            System.out.println(y);
        }
       
    
}
