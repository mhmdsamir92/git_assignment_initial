/*@author Esraa Ramadan
        */

public class Power implements ISubscriber {


    public int Power( String input)
    {    int base = 2;

        int result=1;
        for (int i = 0; i < Integer.parseInt(input); i++) {
            result *= base;
        }
        return result;
    }
    public void notifySubscriber(String input) {
        System.out.println(" 2 POWER YOUR NUMBER IS: " + Power(input));

        // TODO Auto-generated method stub

    }

}