package viki.fib.parser;

public class NumberParserException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NumberParserException(String message) {
        super(message);
    }

    public NumberParserException(String message, Throwable cause) {
        super(message, cause);
    }

}
