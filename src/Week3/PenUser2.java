package Week3;

public class PenUser2 {
    public static void main(String[] args) {
        System.out.println("Hello Pen!");

        Pen2 mypen1 = new Pen2();
        mypen1.write();

        Pen2 mypen2 = new Pen2("red");
        mypen2.write("IT");

        Pen2 mypen3 = new Pen2(1000);
        mypen3.write(2000);

        Pen2 mypen4 = new Pen2("smu", "yellow", 5000);
        mypen4.write(3000, "ICT", "purple");

        Pen2 mypen5 = new Pen2("smu", "blue");
        mypen5.write();
    }
}
