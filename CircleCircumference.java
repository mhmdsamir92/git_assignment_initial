/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math.*;
/**
 *
 * @author pc
 */
public class CircleCircumference implements ISubscriber{
    @Override
    public void notifySubscriber(String input){
        double radius = Integer.parseInt(input);
        System.out.println ("CircleCircumference: "+2*Math.PI*radius);
    }
}
