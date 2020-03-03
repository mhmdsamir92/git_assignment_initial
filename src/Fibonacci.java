public class Fibonacci implements ISubscriber 
    {
        public void notifySubscriber(String input)
        {
            int c=1,o=0,temp=0;
            int f = Integer.parseInt(input);
            
            System.out.println(0);
            System.out.println(1);
            
            while (c<f)
            {
                temp=c;
                c=c+o;
                o=temp;
                System.out.println(c);
                
                
            }
            
        }
    }