package Week11;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class ColorPanel extends JPanel implements ActionListener {
    JButton button;
    Color color = new Color(0, 0, 0);

    // 패널 생성자
    public ColorPanel() {
        setLayout(new BorderLayout());
        button = new JButton("Color Change :: SSK");
        button.addActionListener(this);
        add(button, BorderLayout.SOUTH);
    }

    // Rect 그리기
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(50, 50, 300, 300);
    }

    // 이벤트 처리(그려져야되는 값이 달라짐) -> repaint() : 그래픽 내용을 다시 보여주고 싶을 때
    public void actionPerformed(ActionEvent e) {
        color = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        repaint(); // event에 대한 paint 함수를 다시 호출함.
    }
}
