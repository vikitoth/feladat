package viki.fib;

public class Fib {

    public long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input should be greater or equals to zero.");
        }
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
