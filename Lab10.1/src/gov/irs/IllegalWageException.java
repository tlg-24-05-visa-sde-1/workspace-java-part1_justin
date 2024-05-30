package gov.irs;

public class IllegalWageException extends Exception{
    //generate the 4 customary ctors for a checked exception
    public IllegalWageException() {
    }

    public IllegalWageException(String message) {
        super(message);
    }

    public IllegalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause) {
        super(cause);
    }
}
