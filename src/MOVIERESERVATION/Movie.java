package MOVIERESERVATION;

import java.util.HashSet;

public class Movie {
    protected int movieNum;
    protected String movieName;
    protected int price;
    HashSet<Integer> reservedSeat = new HashSet<>();

    public Movie(String movieName, int price) {
        this.movieName = movieName;
        this.price = price;
    }

    // movieNum
    public int getMovieNum() {
        return movieNum;
    }

    // movieName
    public String getMovieName() {
        return movieName;
    }

    // price
    public int getPrice() {
        return price;
    }

    // reservedSeat
    public int reservedSeat(int seat) throws OutOfSeatsException {
        if (seat <= 0 || seat > 30) {
            throw new OutOfSeatsException();
        } else {
            if (reservedSeat.contains(seat)) {
                System.out
                        .println("no." + seat + " seat is already reserved. Try another number that is not reserved.");
                return 1; // NO reserve
            } else {
                reservedSeat.add(seat);
                System.out.println("no." + seat + " seat reserved completely. THANK YOU");
                System.out.println();
                return 0; // complete
            }
        }
    }

    public void removeSeat(int seat) {
        reservedSeat.remove(seat);
    }

    public void showReservedSeat() {
        if (reservedSeat.size() == 0) {
            System.out.println("All seats are currently available for reservation.");
        } else {
            System.out.print("Seats that have been reserved is ");
            System.out.println(reservedSeat.toString() + ".");
        }
    }

    public void showMovieInfo() {
        System.out.println(movieName + ", " + price);
    }
}
