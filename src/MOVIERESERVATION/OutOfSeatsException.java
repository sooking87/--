package MOVIERESERVATION;

public class OutOfSeatsException extends Exception {
    public OutOfSeatsException() {
        super("Seats has no.1 to no.30.");
    }
}
