package home_work_2.loops.Task1Redone;

public class IsDoubleNotIntegerException extends IllegalArgumentException {
    public IsDoubleNotIntegerException() {
        super("Передано не целое число");
    }

    public IsDoubleNotIntegerException(String s) {
        super(s);
    }

    public IsDoubleNotIntegerException(String message, Throwable cause) {
        super(message, cause);
    }

    public IsDoubleNotIntegerException(Throwable cause) {
        super(cause);
    }
}
