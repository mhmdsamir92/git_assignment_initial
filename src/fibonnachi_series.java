


/* fibonnachi series
   name: omar mahmoud salah
   id:20160163
*/

public class fibonnachi_series implements ISubscriber{
    
	 static int fibb(int N) 
	    { 
	        if (N <= 1) 
	            return N; 
	        else{
	        	
	        	return fibb(N - 1) + fibb(N- 2);}; 
	    } 
     
     public void notifySubscriber(String input) {

        System.out.print("Hello, I am fibonnachi series and I am notified with " + input);

        System.out.println(" and my result is : " + fibb(Integer.parseInt(input)));
    }
}

