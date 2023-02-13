import java.io.IOException;

public class WrongAgeException extends IOException {
    public WrongAgeException() {
    }

    public WrongAgeException(String message) {
        super(message);
    }
}
