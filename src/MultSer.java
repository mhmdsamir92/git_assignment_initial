public class MultSer implements ISubscriber {
	public  void notifySubscriber(String input){
		int n=Integer.parseInt(input); 
        for(int i=1; i <= 10; i++)
       	{
       		System.out.println(n+" * "+i+" = "+n*i);
       	}           
    }
}
