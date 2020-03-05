public class SphereArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int radius = Integer.parseInt(input);
        System.out.println("The sphere area is "+4*radius*radius*3.14);
    }
}
