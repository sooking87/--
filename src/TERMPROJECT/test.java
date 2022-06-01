
package TERMPROJECT;

import java.awt.*;
import javax.swing.*;

public class test {
    JFrame jf;
    JPanel p = new JPanel();
    JTabbedPane tp;

    public test() {
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tp = new JTabbedPane();

        // tab의 사이즈에 따른 Panel 생성 = tab의 수, tab마다 Panel을 생성한다.
        JPanel one = new JPanel();
        JPanel two = new JPanel();
        JPanel three = new JPanel();

        // JTabbedPane에 탭 달기
        tp.addTab("SMU", one);
        tp.addTab("JOJI", two);
        tp.addTab("미정", three);

        // Panel 색깔 바꾸기
        one.setBackground(Color.RED);
        two.setBackground(Color.YELLOW);
        three.setBackground(Color.BLUE);

        p.add(tp);
        jf.add(p);
        jf.setSize(500, 500);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new test();
    }

}
