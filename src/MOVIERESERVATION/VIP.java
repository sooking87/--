package MOVIERESERVATION;

public class VIP extends Customer {
    double saleRatio;

    public VIP() {
    }

    public VIP(String customerName) {
        this.customerName = customerName;
        this.customerGrade = "VIP";
        this.bonusRatio = 0.03;
        this.saleRatio = 0.1;
    }

    @Override
    public void setMoviePrice(int price) {
        this.moviePrice = (int) (price * (1 - saleRatio));
    }

}
