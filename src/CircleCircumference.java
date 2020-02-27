/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SW2_git_assignment_CircleCircumference;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class CircleCircumference implements ISubscriber {
    
     @Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am CircleCircumference subscriber and I am notified with " + input);
                display(input);
	}
        
    void display(String input){ // accept input and check if valid or not then call get_CircleCircumference and display the result.
        double radius=0;
        try{ //check if the input can converted to double or not ..
        radius=Double.valueOf(input); // convert input String to double.
        }catch (NumberFormatException e) {
            System.out.println(" invalid input ");
            e.getMessage();
            return;
        }
        if (radius<0) {System.out.println(" Sorry,You enterd invalid radius. "); return; } //its invalid if the input radius < 0. 
        double circumference = get_CircleCircumference(radius);
        System.out.println(" Circumference of a Circle = " + circumference);
    }
    
    double get_CircleCircumference(double radius){ //calc CircleCircumference.
        double circumference;
        circumference = 2 * Math.PI * radius;
        return circumference;
    }
    
   
    
        

}
