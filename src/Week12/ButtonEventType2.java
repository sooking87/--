package Week12;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventType2 extends JPanel implements ActionListener {
    boolean flag = false;
    private int light = 0;

    public ButtonEventType2() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(getPreferredSize());

        JButton b = new JButton("traffic light");
        b.addActionListener(this);
        add(b, BorderLayout.SOUTH);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 빨, 녹, 노 신호등을 만듬
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 100, 100);
        g.drawOval(100, 200, 100, 100);
        g.drawOval(100, 300, 100, 100);

        // light가 0이면
        if (light == 0) {
            g.setColor(Color.RED);
            g.fillOval(100, 100, 100, 100);
        }
        // light가 1이면
        else if (light == 1) {
            g.setColor(Color.GREEN);
            g.fillOval(100, 200, 100, 100);
        }
        // light가 2이면
        else {
            g.setColor(Color.ORANGE);
            g.fillOval(100, 300, 100, 100);
        }
    }

    public void actionPerformed(ActionEvent arg0) {
        if (++light >= 3) // 만약 1이 더해진 light가 3이상이라면
            light = 0; // 0부터 다시 시작
        System.out.println(light);
        repaint();
    }
}
