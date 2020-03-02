public class twoPowerN extends ThreadSubscriber{
    String input;
    @Override
    public void notifySubscriber() {
        input =topic.getInput();
        System.out.println("two power n  = "+execute());
    }


    @Override
    public String execute() {
    	int exponent=Integer.parseInteger(input);
    	  static int twoPowerN(exponent)
  	    {
  	    	 int product=2;
  	   	  
  	   	  switch (exponent){
  	   		  case 0 :
  	   			  product=1;
  	   			  break;}
  	   	 
  	   			for(int i =1;i< exponent;i++)
  	   			{ 
  	   				product=product*2;
  	   				}
  	   			
  	   			 return product;
  	    }
  	
  	
      
        return String.valueOf(product);
    }
}
