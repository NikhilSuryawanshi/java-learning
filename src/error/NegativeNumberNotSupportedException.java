package error;

public class NegativeNumberNotSupportedException extends Throwable{

    public NegativeNumberNotSupportedException() {
    }

    public NegativeNumberNotSupportedException(String message) {
        super(message);
    }

    public NegativeNumberNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeNumberNotSupportedException(Throwable cause) {
        super(cause);
    }

    public NegativeNumberNotSupportedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
