
public class SphereArea implements ISubscriber{

    @Override
    public void notifySubscriber(String input) {
        int intInput = Integer.parseInt(input);
        double res = 4.0 * 3.14159265359 * intInput * intInput;
        System.out.print("The sphere area is : " + res + "\n");
    }
}
