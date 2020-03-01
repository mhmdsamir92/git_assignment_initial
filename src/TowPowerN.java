
public class TowPowerN implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		int p = Integer.parseInt(input), res = 2;

                for(int i = 1 ; i < p ; i++){
                    res += res;
                }

                System.out.println(res);
	}
}