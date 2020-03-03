public class fibonacci implements ISubscriber {
	
	int calcFib(String input){
		int x = Integer.parseInt(input);
		int ans = 0 ;
		int fibN_1 = 1 ,fibN_2 = 1 ,fibN = 0;
		
		for(int i = 2 ; i < x ; i ++) {
			fibN = fibN_1 + fibN_2;
			fibN_2 = fibN_1;
			fibN_1 = fibN;
		}
		return fibN;
	}
	@Override
	 public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		
		System.out.println("fibonacci of "+input+ " = " + calcFib(input));
		
	}
}