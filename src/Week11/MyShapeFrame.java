package Week11;

import javax.swing.*;

public class MyShapeFrame {
    public MyShapeFrame() {
        JFrame jf = new JFrame("My Shape Panel / Line Draw :: SSK");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyShapePanel msp = new MyShapePanel();
        jf.add(msp);
        jf.setVisible(true);
    }
}
