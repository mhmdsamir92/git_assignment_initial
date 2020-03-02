public class CircleCircumference implements ISubscriber
{
    @Override
    public void notifySubscriber(String input)
    {
        Double radius = Double.parseDouble(input);
        Double res = 2*Math.PI*radius;
        System.out.println("circleCircumference is "+res );

    }

}
