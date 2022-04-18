package MOVIERESERVATION;

public class Customer {
    protected String customerName;
    protected String customerGrade;
    protected String reservedMovie;
    int moviePrice;
    int bonusPoint;
    double bonusRatio;
    int seat;
    int movieNum;

    public Customer() {
    }

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerGrade = "General";
        this.bonusRatio = 0.01;
    }

    // CustomerName
    public String getCustomerName() {
        return customerName;
    }

    // reservedMovie
    public void setReservedMovie(String movie) {
        this.reservedMovie = movie;
    }

    public String getReservedMovie() {
        return reservedMovie;
    }

    // moviePrice
    public void setMoviePrice(int price) {
        this.moviePrice = price;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    // bonusPoint
    public void setBonusPoint(int price) {
        bonusPoint += price * bonusRatio;
    }

    public void resetBonusPoint(int price) {
        bonusPoint -= price * bonusRatio;
    }

    // seat
    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    // movieNum
    public void setMovieNum(int movieNum) {
        this.movieNum = movieNum;
    }

    public int getMovieNum() {
        return movieNum;
    }

    public void showCustomerInfo() throws NoReservedMovieException {
        if (reservedMovie == null) {
            throw new NoReservedMovieException();
        } else {
            System.out.println(
                    customerName + " reserved movie is " + reservedMovie + "and, no." + seat + " seat. \nTotal Point: "
                            + bonusPoint + "\nPrice: "
                            + moviePrice);
        }
    }
}
