/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author dell
 */
public class MultSer implements ISubscriber {
     {
	public  void notifySubscriber(String input){
           int n=Integer.parseInt(input); 
          for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }   
            
        }
}
}
