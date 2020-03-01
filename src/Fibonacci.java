package com.company ;
public class Fibonacci implements ISubscriber {
	@Override
	public void notifySubscriber(int n) {
		int pascTriangle[][]  =  new int [n][n] ;
		pascTriangle[1][0] = 1;
		pascTriangle[1][1] = 1;

		if (n == 1 || n == 2) System.out.println("Result is:" +1) ;
		else {
			// drawing pascal's triangle as a base for Fibonnacii
			for (int i = 2; i <= n; i++) {
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

			System.out.println("Result is:" +result) ;
		}
	}
}
