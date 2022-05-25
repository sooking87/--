package Week12;

import javax.swing.JFrame;

public class MouseMoveEventMain {
    JFrame jf;

    public MouseMoveEventMain(String msg) {
        jf = new JFrame(msg);
        jf.setSize(800, 900);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new MouseMoveEvent());
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMoveEventMain("Mouse Type Event Test :: SSK");
    }
}
