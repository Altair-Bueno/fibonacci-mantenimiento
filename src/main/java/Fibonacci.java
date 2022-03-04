import java.math.BigInteger;

/**
 * A static class used to compute Fibonacci numbers
 */
public class Fibonacci {

    private Fibonacci(){}

    /**
     * Computes the Fibonacci sequence.
     * <p>
     * Given a valid position, this method will compute the nth number on the
     * Fibonacci sequence, starting from 0. Null arguments will produce a null
     * output. This implementation uses a non-recursive algorithm to prevent
     * stack overflows
     *
     * @param position A BigInteger representing the position on the Fibonacci sequence, starting from 0
     * @return The computed Fibonacci number
     */
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
