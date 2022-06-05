package TERMPROJECT;

import javax.swing.*;
import java.awt.event.*;

public class IntroFrame {
    JFrame frame;
    IntroPanel intro = new IntroPanel(); // 로고와 String이 들어갈 패널
    ListPanel li = new ListPanel();

    public IntroFrame() {
        frame = new JFrame();
        frame.setTitle("IT공학전공_2116313_손수경_IntroFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // 화면 클릭시 Order 클래스 생성
        frame.add(intro);
        intro.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
                Order orderPanel = new Order(li, intro);
                intro.setVisible(false);
                frame.add(orderPanel);
            }
        });

        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

}
