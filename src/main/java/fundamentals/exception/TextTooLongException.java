package fundamentals.exception;

public class TextTooLongException extends Exception {
    public TextTooLongException(String text) {
        super(text);
    }
}