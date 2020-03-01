public class Lucas implements ISubscriber {
    int tmp[] = {2,1};
    @Override
    public void notifySubscriber(String input) {
        System.out.print("Lucas: ");
        int intInput = Integer.parseInt(input);
        for (int i=0; i<intInput; i++){
            if (i==0) System.out.print(2 + " ");
            else if(i==1) System.out.print(1 + " ");
            else {
                int res = tmp[0] + tmp[1];
                tmp[0] = tmp[1];
                tmp[1] = res;
                System.out.print(res + " ");
            }
        }
        System.out.println(" ");
    }
}
