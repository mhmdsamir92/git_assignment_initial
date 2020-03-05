/*
 ============================================================================
 Description : A class contain a method to calculate the volume of  ball.
 Author      : Shrouk Hussein Hussein
 Version     : 1.0
 ID          : 20170127
 Group       : CS_2
 ============================================================================
*/
public  class CalcBallVolume implements ISubscriber {
	public static double BallVolume (String redius) {
		return( double)4/3 *Math.PI*Math.pow(Integer.parseInt(redius), 3);
		
		
	}
    
	@Override
	public void notifySubscriber(String input) {
		System.out.println("Thevolume of ball is: " + BallVolume (input));
		
	}

}
