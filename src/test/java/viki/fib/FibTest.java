package viki.fib;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibTest {

    @Test
    public void fib_shouldReturnZero_whenZeroProvided() {
        Fib f = new Fib();
        int n = 0;

        long result = f.fib(n);

        assertEquals(0, result);
    }

    @Test
    public void fib_shouldReturnOne_whenOneProvided() {
        Fib f = new Fib();
        int n = 1;

        long result = f.fib(n);

        assertEquals(1, result);
    }

    @Test
    public void fib_shouldReturnOne_whenTwoProvided() {
        Fib f = new Fib();
        int n = 2;

        long result = f.fib(n);

        assertEquals(1, result);
    }

    @Test
    public void fib_shouldReturnTwo_whenThreeProvided() {
        Fib f = new Fib();
        int n = 3;

        long result = f.fib(n);

        assertEquals(2, result);
    }

    @Test
    public void fib_shouldThrownIllegalArgumentException_whenMinusOneProvided() {
        Fib f = new Fib();
        int n = -1;

        assertThrows(IllegalArgumentException.class, () -> f.fib(n));
    }
}
