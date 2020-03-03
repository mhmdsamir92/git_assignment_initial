package company;
public class Fibonacci extends IntegerSubscriber{

	@Override
	public void preProcess(int input) throws Exception {

		if(input < 1 ) throw new Exception("0 and Negative values are invalid ") ;

		System.out.println("I'am Fibonnacii and I'am notified with >> " + input);
	}

	@Override
	public int doCalculation(int n) {

		if (n == 1 || n == 2) return 1 ;

		int pascTriangle[][]  =  new int [n][n] ;

		// drawing pascal's triangle as a base for Fibonnacii

			for (int i = 2; i < n; i++) {
				pascTriangle[i][0] = 1;
				for (int j = 1; j <= i; j++) {
					pascTriangle[i][j] = pascTriangle[i - 1][j - 1] + pascTriangle[i - 1][j];
				}
				pascTriangle[i][i] = 1;
			}

			int i = n - 1;
			int j = 0;
			int result = 0;

			while (j <= i)
			{
				result += pascTriangle[i][j];
				i--;
				j++;

			}

			return result ;

		}

	@Override
	public void printAnswer(int out) {

		System.out.println("the answer is " + out );
	}
}
