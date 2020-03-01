import java.sql.SQLOutput;

public class SphereArea implements ISubscriber {


    @Override
    public void notifySubscriber(String input) {

        double R = Double.parseDouble(input);

        double sphereArea = calcSphereArea(R);

        System.out.println("The Sphere Area = " + sphereArea);

    }

    double calcSphereArea(double r){

        double sphereArea = 0.0;

        sphereArea = 4 * Math.PI * Math.pow(r, 2);

        return sphereArea;
    }
}
