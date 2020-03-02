package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m_h
 */
public class Fibonacci {
   public  long Get_Fibonacci(long n) {
      if ((n == 0) || (n == 1))
         return n;
      else
         return Get_Fibonacci(n - 1) + Get_Fibonacci(n - 2);
   }
}
