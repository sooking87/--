package Week8;

import javax.swing.JFrame;

import javax.swing.*;

public class JFrameTest {

    public JFrameTest(String msg) {
        JFrame jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}
