
public class LucasSeries implements ISubscriber {
	
	void calculateLucasSeries(int m)
	{
		int first = 2;
	    int second = 1;
	    int temp = 0;
	    int []arr = new int[m];
	    if(m == 1)
	    {
	      System.out.println("The Lucas Series is: " + 2);
	    }
	    
	    else if(m == 2)
	    {
	      System.out.println("The Lucas Series is: 2,1");
	    }
	    
	    arr[0] = 2;
	    arr[1] = 1;
	    
	    for(int i = 2; i < m; i++)
	    {
	      temp = first + second;
	      arr[i] = temp;
	      first = second;
	      second = temp;      
	    }
	    System.out.print("The Lucas Series is: ");
	    for(int i = 0; i < m; i++)
	    {
	      System.out.print(arr[i]+",");
	    }

	    
	}

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		int m = Integer.parseInt(input);
		calculateLucasSeries(m);
	}

}
