package Week13;

public class ThreadTest {
    MyThread t1, t2, t3;

    ThreadTest() {
        t1 = new MyThread("Sohn");
        t2 = new MyThread("Soo");
        t3 = new MyThread("Kyoung");

        t1.start();
        t2.start();
        t3.start();
    }
}
