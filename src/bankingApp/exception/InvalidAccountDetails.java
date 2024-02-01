package bankingApp.exception;

public class InvalidAccountDetails extends RuntimeException {
    public InvalidAccountDetails(String message) {
        super(message);
    }
}
