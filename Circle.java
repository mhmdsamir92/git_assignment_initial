public class Circle implements ISubscriber{
    public void notifySubscriber(String input){
        Integer radius = Integer.parseInt(input);
        System.out.println("The circle area is: " + calculateArea(radius));
    }

    private double calculateArea(Integer radius){
        return Math.PI * radius * radius;
    }
}
