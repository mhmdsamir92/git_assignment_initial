import java.util.Arrays;

public class LucasSeries implements ISubscriber
{
    private long mem[] = new long[48];
    private long lucas_series(int idx)
    {
        if(idx == 0)
            return 2;
        if(idx == 1)
            return 1;
        if(mem[idx] == 0)
            mem[idx] = lucas_series(idx - 1) + lucas_series(idx - 2);
        return mem[idx];
    }
    @Override
    public void notifySubscriber(int input)
    {
        Arrays.fill(mem,0);
        System.out.println("The Result of Lucas Series is " + lucas_series(input));
    }
}
