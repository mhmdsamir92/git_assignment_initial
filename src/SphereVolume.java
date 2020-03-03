import java.lang.Math;
public class SphereVolume extends DoubleSubscriber {

	private static double value = 4.0/3.0;
	
	@Override
	public void preProcess(int input) throws Exception {
		 System.out.print("Hello, I'm SphereVolume, and I'm notified with: " + input + " as radius. ");
	        if (input < 0) throw new Exception("Negative radius is invalid!");
		
	}



	@Override
	public double doCalculation(int input) {
		return value*(Math.PI)*Math.pow(input, 3);
		
	}



	@Override
	public void printAnswer(double output) {
		System.out.println("Sphere Volume is: " + output);

		
	}


	


}
