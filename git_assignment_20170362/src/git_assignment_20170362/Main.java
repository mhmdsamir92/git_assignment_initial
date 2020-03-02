/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_assignment_20170362;

import java.util.Scanner;

public class Main {
    
    	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new SphereArea(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
                
                System.out.println("Enter the raduis of Sphere : " );

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
    
}
