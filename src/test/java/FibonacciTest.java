import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

class FibonacciTest {

    @Test
    public void checkFirstThirty() {
        var secuence = List.of(
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
                610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657,
                46368, 75025, 121393, 196418, 317811,514229
        );
        for (var i = 0;i<secuence.size();i++) {
            var expected = BigInteger.valueOf(secuence.get(i));
            var position = BigInteger.valueOf(i);

            var result = Fibonacci.fibonacci(position);

            assert expected.equals(result);
        }
    }
    @Test()
    public void nullInput() {
        var result = Fibonacci.fibonacci(null);

        assert result == null;
    }
    @Test
    public void stackOverflow() {
        var position = BigInteger.valueOf(100000L);
        var result = Fibonacci.fibonacci(position);
        assert result != null;
    }
    @Test
    public void sideEffects() {
        var position = BigInteger.TEN;
        Fibonacci.fibonacci(position);
        assert position.equals(BigInteger.TEN);
    }
}