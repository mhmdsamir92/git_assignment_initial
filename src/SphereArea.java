package src;
public class SphereArea implements ISubscriber{
    public float SArea(float R){
        float result;
        result=4*(float)(22.0/7.0)*(R*R);
        return result;
    }
    
    @Override
    public void notifySubscriber(String input){
        System.out.print("Hello, I am a Sphere Area and I am notified with " + input);
        System.out.println(" and my result is : " + SArea(Integer.parseInt(input)));
    }
}


