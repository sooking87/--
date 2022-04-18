package MOVIERESERVATION;

public class NoSetMoviesException extends Exception {
    public NoSetMoviesException() {
        super("There is not setting movies yet");
    }
}
