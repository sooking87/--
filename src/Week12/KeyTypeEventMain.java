package Week12;

import javax.swing.JFrame;

public class KeyTypeEventMain {
    JFrame jf;

    public KeyTypeEventMain(String msg) {
        jf = new JFrame(msg);
        jf.setSize(800, 900);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new KeyTypeEvent());
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyTypeEventMain("Key Type Event Test :: SSK");
    }
}
