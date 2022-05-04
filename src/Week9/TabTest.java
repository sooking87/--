package Week9;

import java.awt.*;
import javax.swing.*;

public class TabTest {
    JFrame jf;
    JTabbedPane tp;

    public TabTest(String msg) {
        jf = new JFrame(msg);
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

        // Tab의 panel에 사진 붙히기
        // one : 로고 사진
        ImageIcon logo = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog.png");
        JLabel jl = new JLabel("SMU Logo", logo, JLabel.RIGHT);
        jl.setFont(new Font("굴림", Font.BOLD, 30));
        one.add(jl);

        // two : 강아지 사진
        ImageIcon logo2 = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog2.png");
        JLabel jl2 = new JLabel("JOJI", logo2, JLabel.RIGHT);
        jl.setFont(new Font("굴림", Font.BOLD, 30));
        two.add(jl2);

        // 다른 탭 추가하기... + 이벤트 처리까지 해보기 . -> select부분 2가지를 추가해보기.

        jf.getContentPane().add(tp);
        jf.setSize(500, 500);
        jf.setVisible(true);

    }
}
