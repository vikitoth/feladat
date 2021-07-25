package viki.fib.parser;

public class NumberParser {

    public int parse(String[] args) {
        if (args.length < 1) {
            throw new NumberParserException("Missing argument! Please provide a number!");
        }
        return parse(args[0]);
    }

    public int parse(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException nfe) {
            throw new NumberParserException("Invalid number! " + arg, nfe);
        }
    }
}
