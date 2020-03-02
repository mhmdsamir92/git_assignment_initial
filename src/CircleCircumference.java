/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecircumference;

import java.util.Scanner;

/**
 *
 * @author ahmed farag
 */
public class CircleCircumference {

    void CalculateCircleCircumference (float radius)
    {
        radius=0;
        Scanner inbut=new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        radius=inbut.nextFloat();
        double circlecircumference=0;
        circlecircumference=2*(3.14)*radius;
        System.out.print("Circle Cumference Equal = "+circlecircumference);
    }
    public static void main(String[] args) {
       
       CircleCircumference c=new CircleCircumference();
       c.CalculateCircleCircumference(0);
    }
    
}
