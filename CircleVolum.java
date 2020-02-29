/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlevolum;

import java.util.Scanner;

/**
 *
 * 
 */
public class CircleVolum implements ISubscriber{
    public void notifySubscriber(String input){
        Integer radius = Integer.parseInt(input);
        System.out.println ("Circlevolum: "+4/3*Math.PI*radius);
    }
}
