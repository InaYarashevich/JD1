package home_work_2.loops.Task1Redone;

public class IsStringNotIntegerException extends IllegalArgumentException {
    public IsStringNotIntegerException() {
        super("Передано не число");
    }

    public IsStringNotIntegerException(String s) {
        super(s);
    }

    public IsStringNotIntegerException(String message, Throwable cause) {
        super(message, cause);
    }

    public IsStringNotIntegerException(Throwable cause) {
        super(cause);
    }
}
