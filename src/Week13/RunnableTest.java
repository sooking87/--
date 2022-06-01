package Week13;

public class RunnableTest {
    RunnableTest() {
        Thread t1 = new Thread(new MyRunnable1(), "Sohn");
        Thread t2 = new Thread(new MyRunnable2(), "Soo");
        Thread t3 = new Thread(new MyRunnable3(), "Kyoung");

        t1.start();
        t2.start();
        t3.start();
    }
}
