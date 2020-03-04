import java.text.DecimalFormat;

public class MultiplicationSeries implements ISubscriber{

	public void notifySubscriber(String input) {
		DecimalFormat df= new DecimalFormat();
		double n= Integer.parseInt(input);
		System.out.println("Term "+df.format(n)+" is "+df.format(getTerm(n))+". ");
	}
  
	public static double getTerm(double j){
		if (j==1) return 1;
		if (j==2) return 2;
		if (j<=0){
			System.out.println("Error");
		}
		return getTerm(j-1)*getTerm(j-2);
		
	}

}
