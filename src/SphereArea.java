
public class SphereArea implements ISubscriber{
	@Override
	 public void notifySubscriber(String input) {
        

		double radius = Integer.parseInt(input);		
			 double Area = 4*(Math.PI)*Math.pow(radius, 2); 
			 System.out.println("The Area of Sphere = " +  Area +" square meters" );
			 
			 
		}

	}


