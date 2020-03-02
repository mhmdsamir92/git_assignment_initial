


class Fibonacci implements ISubscriber{

    void printFibonacci(int count){    
    int n1=0,n2=1,n3,i;    
        System.out.println("the Fibonacci for " + count);
    System.out.print(n1+" "+n2);//printing 0 and 1    

    for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
    {    
     n3=n1+n2;    
     System.out.print(" "+n3);    
     n1=n2;    
     n2=n3;    
    }    
 }    


    @Override
    public void notifySubscriber(String input) {
        int n = Integer.parseInt(input);
       printFibonacci(n);
    }
}