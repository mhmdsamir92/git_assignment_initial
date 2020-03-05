package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m_h
 */
public class Fibonacci implements ISubscriber {
   @Override
   public  void notifySubscriber(long n) {
      if ((n == 0) || (n == 1))
         System.out.println("Fibonacci of "+ n + " = " + n );
      else
         System.out.println("Fibonacci of " + n + " = " + Get_Fibonacci(n - 1) + Get_Fibonacci(n - 2));
   }
}
