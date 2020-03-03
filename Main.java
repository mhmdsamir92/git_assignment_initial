/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2powern;
/**
 *
Ebtsam FATHY
*/
  import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {

      int N,pow;
      int Result=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      N=sc.nextInt();
       System.out.println("enter the power");
      pow=sc.nextInt();
      if(N>=0&&pow==0){
          Result=1;
      }
      if(N==0&&pow>=1){
          Result=0;
      }
      else{
          int i=1;
          while(i<=pow){
              Result=Result*N;
              i++;
          }
      }
      System.out.println( N+"^"+pow+"="+Result);
          
      }
    }
    

