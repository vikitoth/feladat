package viki.fib;

import viki.fib.parser.NumberParser;
import viki.fib.parser.NumberParserException;

public class FibMain {

    public static void main(String[] args) {
        try {
            NumberParser parser = new NumberParser();
            int n = parser.parse(args);

            Fib fib = new Fib();

            var result = fib.fib(n);

            System.out.println(result);

        } catch (NumberParserException e) {
            System.out.println(e.getMessage());
        }
    }
}
