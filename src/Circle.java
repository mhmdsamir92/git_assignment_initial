public class Circle implements ISubscriber{
    public void notifySubscriber(String input){
        Double radius = Double.parseDouble(input);
        System.out.println("The circle area is: " + calculateArea(radius));
    }

    private double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
}
