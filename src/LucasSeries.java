import java.math.BigInteger;

public class LucasSeries implements ISubscriber{
    BigInteger term;

    @Override
    public void notifySubscriber(String input) {
        Integer idx = Integer.valueOf(input);
        if (idx == 0)
            term = BigInteger.valueOf(2);
        else if (idx == 1)
            term = BigInteger.valueOf(1);
        else
        {
            BigInteger prev = BigInteger.valueOf(2);
            term = BigInteger.valueOf(1);
            for (int i = 0; i < idx - 1; ++i)
            {
                BigInteger newTerm = term.add(prev);
                prev = term;
                term = newTerm;
            }
        }
        System.out.println("Lucas Term: " + term);
    }
}
