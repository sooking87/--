package Week13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Car extends JButton implements Runnable {
    public static int rank1; // 등수를 알기 위해서 static 한 동일한 메모리 영역에 필요하다
    private int rank2; // 자신의 등수를 알기 위한 private
    private ImageIcon name;
    public JPanel lane = new JPanel();
    private int x, y; // Car 위치 값

    public Car(ImageIcon name, int x, int y) {
        lane.setLayout(null);
        int r, g, b;
        r = (int) (Math.random() * 256);
        g = (int) (Math.random() * 256);
        b = (int) (Math.random() * 256);
        lane.setBackground(new Color(r, g, b));
        this.name = name;
        this.setIcon(name);
        this.setBackground(Color.PINK);
        this.setOpaque(false);
        this.setBounds(x, y, 130, 200);
        lane.add(this);
    }

    public void run() {
        // 차가 달리는 부분
        for (int i = 0; i < 1024; i++) {
            x = i;
            // Car 움직이게 하는 부분;
            this.setBounds(x, y, 130, 200);
            // 차마다 서로 다른 임의의 interval을 가짐
            try {
                Thread.sleep((int) (Math.random() * 20));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // 차 경기 종료
        rank1++;
        rank2 = rank1;
        (lane.getGraphics()).drawString(rank2 + " Rank", 800, 30);

    }

}
