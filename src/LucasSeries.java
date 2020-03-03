import java.math.BigInteger;

public class LucasSeries {

    private static BigInteger TWO = BigInteger.valueOf(2);

    public static BigInteger fibonacci(BigInteger number) {
       if (number.equals(BigInteger.ZERO))
        return TWO;

    if(number.equals(BigInteger.ONE))
        return BigInteger.ONE;

    return fibonacci(number.subtract(BigInteger.ONE)).add(
            fibonacci(number.subtract(TWO)));
    }
}