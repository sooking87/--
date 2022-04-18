package Week3;

public class Pen2 {
    String vender;
    String color;
    int price;

    Pen2() {

    }

    Pen2(String col) {
        color = col;

    }

    Pen2(int value) {
        price = value;
    }

    Pen2(String name, String col) {
        vender = name;
        color = col;
    }

    Pen2(String name, String col, int value) {
        vender = name;
        color = col;
        price = value;
    }

    public void write() {
        System.out.println("Pen: write()");
        System.out.println("Pen: vender: " + vender);
        System.out.println("Pen: color: " + color);
        System.out.println("Pen: price: " + price);
    }

    public void write(int xx) {
        System.out.println("Pen: write()");
        System.out.println("Pen: vender: " + vender);
        System.out.println("Pen: color: " + color);
        System.out.println("Pen: price: " + xx);
    }

    public void write(String yy) {
        System.out.println("Pen: write()");
        System.out.println("Pen: vender: " + yy);
        System.out.println("Pen: color: " + color);
        System.out.println("Pen: price: " + price);
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
