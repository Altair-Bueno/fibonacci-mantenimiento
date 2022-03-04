import java.math.BigInteger;

public class Fibonacci {

    private Fibonacci(){}

    public static BigInteger fibonacci(BigInteger position) {
        if (position == null) return null;

        var nth = BigInteger.ZERO;
        var nthPlusOne = BigInteger.ONE;

        while (!position.equals(BigInteger.ZERO)) {
            var temp = nth;
            nth = nthPlusOne;
            nthPlusOne = temp.add(nthPlusOne);
            // Note: BigIntegers are Inmutable, and thus this will not affect
            // the caller
            position = position.subtract(BigInteger.ONE);
        }
        return nth;
    }
}
