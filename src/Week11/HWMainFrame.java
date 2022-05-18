package Week11;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class HWMainFrame {
    JFrame jf = new JFrame("차트 만들기");
    JPanel screen = new JPanel();

    public HWMainFrame() {
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(2, 3, 10, 10));
        screen.setBackground(Color.LIGHT_GRAY);
        // 각 패널 넣는 방법 -> 넣을 패널 만들기, setBorder()를 통해서 보더를 패널에 넣음 -> screen 패널에 각 패널을 넣음

        // 첫 번째: 소개창 만들기
        TitledBorder first = new TitledBorder(new LineBorder(Color.BLUE), "");
        JPanel myPanel1 = new HWIntro();
        myPanel1.setBorder(first);
        myPanel1.setBackground(Color.LIGHT_GRAY);
        screen.add(myPanel1);

        // 두 번째: 원형 차트 만들기
        TitledBorder second = new TitledBorder(new LineBorder(Color.BLUE), "");
        JPanel myPanel2 = new HWPieChart();
        myPanel2.setBorder(second);
        myPanel2.setBackground(Color.LIGHT_GRAY);
        screen.add(myPanel2);

        // 세 번째: 막대 차트 만들기
        TitledBorder third = new TitledBorder(new LineBorder(Color.BLUE), "");
        JPanel myPanel3 = new HWRectChart();
        myPanel3.setBorder(third);
        myPanel3.setBackground(Color.LIGHT_GRAY);
        screen.add(myPanel3);

        // 네 번째: 선형 차트 만들기
        TitledBorder fourth = new TitledBorder(new LineBorder(Color.BLUE), "");
        JPanel myPanel4 = new HWLinearChart();
        myPanel4.setBorder(fourth);
        myPanel4.setBackground(Color.LIGHT_GRAY);
        screen.add(myPanel4);

        // 다섯 번째: 나만의 차트 만들기
        TitledBorder fifth = new TitledBorder(new LineBorder(Color.BLUE), "");
        JPanel myPanel5 = new HWSelfChart();
        myPanel5.setBorder(fifth);
        myPanel5.setBackground(Color.LIGHT_GRAY);
        screen.add(myPanel5);

        jf.add(screen);
        jf.setSize(1920, 1080);
        jf.setVisible(true);

    }
}
