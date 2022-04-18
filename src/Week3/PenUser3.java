package Week3;

public class PenUser3 {
    public static void main(String[] args) {
        System.out.println("Hello Pen!");

        Pen3 mypen1 = new Pen3();
        mypen1.write();
        mypen1.write(10000);
        mypen1.write(1000, "Red");
        System.out.println();

        Pen3 mypen2 = new Pen3("IT공학전공");
        mypen2.write();
        mypen2.write(20000);
        mypen2.write(2000, "SMU2");
        System.out.println();

        Pen3 mypen3 = new Pen3("IT공학전공", "노란색", 30000);
        mypen3.write();
        mypen3.write(20000);
        mypen3.write(3000, "SMU3");
        mypen3.write(3000, "SMU3", "Yellow");
    }
}
