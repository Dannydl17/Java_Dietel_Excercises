package diaryApp.exception;

public class WrongPinException extends RuntimeException {
    public WrongPinException(String message) {
        super(message);
    }
}
