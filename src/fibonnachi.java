
/* fibonnachi series
   name: omar mahmoud salah
   id:20160163
*/

public class fibonnachi implements isubscriber{
    
public void fibbseries(int N){  
    int x1=0,x2=1,x3,count=10;    
 System.out.print(x1+"- "x2);  
    
 for(int i=2;i<N;++i)   
 {    
  x3=x1+x2;    
  System.out.print("- "+x3);    
  x1=x2;    
  x2=x3;    
     }}
     
     public void notifySubscriber(String input) {

        System.out.print("Hello, I am fibonnachi series and I am notified with " + input);

        System.out.println("and the result is : " + fibbseries(Integer.parseInt(input)));

    }
}