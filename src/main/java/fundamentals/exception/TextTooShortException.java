package fundamentals.exception;

public class TextTooShortException extends Exception {
    public TextTooShortException(String text) {

        super(text);
    }
}
