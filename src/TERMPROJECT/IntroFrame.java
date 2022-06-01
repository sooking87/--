package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IntroFrame {
    JFrame frame = new JFrame();
    IntroPanel intro = new IntroPanel(); // 로고와 String이 들어갈 패널

    public IntroFrame() {
        frame.setTitle("IT공학전공_2116313_손수경_IntroFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(intro);
        intro.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
                Order orderPanel = new Order();
                intro.setVisible(false);
                frame.add(orderPanel);
            }
        });

        frame.setSize(700, 1080);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new IntroFrame();
    }
}
