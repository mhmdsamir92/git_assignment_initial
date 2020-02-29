
package main;
public class LucasSeries implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
       int Lenght = Integer.parseInt(input);
       System.out.println("Hello, I am really a simple Lucas series and I am notified with " + input);
       int []Series_numbers = new int[Lenght];
             switch (Lenght) {
          case 1:
              System.out.println("The Lucas Series is: 2");
              break;
          case 2:
              System.out.println("The Lucas Series is: 2,1");
              break;
          default:
              int F_Number = 2;
              int S_Number = 1;
              int Temp = 0;
              Series_numbers[0] = 2;
              Series_numbers[1] = 1;
              for(int i = 2; i < Lenght; i++){
                  Temp = F_Number + S_Number;
                  Series_numbers[i] = Temp;
                  F_Number = S_Number;
                  S_Number = Temp;
              }     
              System.out.print("The Lucas Series is: ");
              for(int i = 0; i < Lenght; i++){
                  if (i < Lenght - 1)
                      System.out.print(Series_numbers[i]+",");
                  else
                      System.out.println(Series_numbers[i]);
              }
              break;
      }
    }
    
}
