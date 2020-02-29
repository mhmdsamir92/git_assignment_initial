/*
 *  Description :- A class contain a method to calculate 2 POWER N
 Author      : ESRAA RAMADAN
 ID          : 20140324
 Group       : CS_1
 */

/**
 *
 * @author Esraa Ramadan
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
	
	
		// TODO Auto-generated constructor stub

		@Override
		public void notifySubscriber(String input) {
                      System.out.println(" 2 POWER YOUR NUMBER IS: " + Power(input));
                      
			// TODO Auto-generated method stub
			
		}

}

