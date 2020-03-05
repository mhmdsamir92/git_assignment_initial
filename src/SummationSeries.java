/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author egypt2
 */
public class SummationSeries implements ISubscriber{
    @Override
    public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
        int n = Integer.parseInt(input);
		System.out.println("Hello, I am really a simple summation series and I am notified with " + input);
        
                int result = 0;
                result = n*(n+1)/2;
        System.out.println("The sum of series is " + result);
	}
    
}