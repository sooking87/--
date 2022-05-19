package Week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HWSelfChart extends JPanel implements ActionListener {
    String week[] = { "월", "화", "수", "목", "금", "토", "일" };
    int walk[] = { 87, 185, 3878, 64, 174, 4197, 8584 };
    Color barColor = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
            (int) (Math.random() * 255.0));

    public HWSelfChart() {
        setLayout(null);
        int x = 35;
        JButton weekBtns[] = new JButton[7];
        for (int i = 0; i < 7; i++) {
            weekBtns[i] = new JButton(week[i]);
            add(weekBtns[i]);
            weekBtns[i].setBounds(x, 350, 60, 30);
            weekBtns[i].addActionListener(this);
            x += 80;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("돋움", Font.PLAIN, 18));
        g.drawString("<나만의 차트-걸음 수를 알려주는 차트>", 130, 30);

        // x축, y축 그리기
        g.drawLine(20, 340, 580, 340); // x축
        g.drawLine(20, 70, 20, 340); // y축

        g.setColor(barColor);
        g.fillRect(45, 100, 40, 240); // 월
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += walk[i];
        }
        System.out.println("sum" + sum);
        for (int i = 0; i < 7; i++) {
            int height = (walk[i] / sum) * 10000;
            System.out.println(walk[i] / sum);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jb = (JButton) e.getSource();
        System.out.println(jb.getText());

    }
}
