package MOVIERESERVATION;

public class NoReservedMovieException extends Exception {
    public NoReservedMovieException() {
        super("There is not any movie that you reserved");
    }
}
