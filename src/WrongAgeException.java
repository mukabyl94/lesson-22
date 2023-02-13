import java.io.IOException;

public class WrongAgeException extends ArithmeticException {
    public WrongAgeException() {
    }

    public WrongAgeException(String s) {
        super(s);
    }
}
