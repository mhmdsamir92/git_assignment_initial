/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team26;
import java.lang.Math.*;
/**
 *
 * @author pc
 */
public class Team26 {
    public double CircleCircumference (int radius){
        return (2*Math.PI*radius);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r=10;
        Team26 t=new Team26();
        System.out.println(t.CircleCircumference(r));
    }
    
}
