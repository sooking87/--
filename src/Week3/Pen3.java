package Week3;

public class Pen3 {
    String vender;
    String color;
    int price;

    public Pen3() {

    }

    public Pen3(String name) {
        vender = name;
    }

    public Pen3(String name, String col, int pp) {
        vender = name;
        color = col;
        price = pp;
    }

    public void write() {
        System.out.println("Pen: write()");
        System.out.println("Pen: vender: " + vender);
        System.out.println("Pen: color: " + color);
        System.out.println("Pen: price: " + price);
    }

    public void write(int xx) {
        System.out.println("Pen: write(int xx)");
        System.out.println("Pen: vender: " + vender);
        System.out.println("Pen: color: " + color);
        System.out.println("Pen: price: " + xx);
    }

    public void write(int xx, String yy) {
        System.out.println("Pen: write(int, String)");
        System.out.println("Pen: vender: " + yy);
        System.out.println("Pen: color: " + color);
        System.out.println("Pen: price: " + xx);
    }

    public void write(int xx, String yy, String zz) {
        System.out.println("Pen: write()");

        System.out.println("Pen: vender: " + yy);
        System.out.println("Pen: color: " + zz);
        System.out.println("Pen: price: " + xx);
    }

    public void erase() {
        System.out.println("Pen: erase()");
    }

}
