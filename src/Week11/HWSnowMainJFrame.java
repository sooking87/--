package Week11;

import java.awt.Color;

import javax.swing.*;

public class HWSnowMainJFrame {
    public HWSnowMainJFrame() {
        JFrame jf = new JFrame("HW 스노우맨 만들기 :: SSK");
        jf.add(new HWSnowMainPanel());

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBackground(new Color(15, 38, 100));
        jf.setSize(500, 800);
        jf.setVisible(true);
    }

}
