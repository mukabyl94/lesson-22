import java.io.IOException;

public class WrongAreException extends IOException {
    public WrongAreException() {
    }

    public WrongAreException(String message) {
        super(message);
    }
}
