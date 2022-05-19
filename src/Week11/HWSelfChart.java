package Week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HWSelfChart extends JPanel implements ActionListener {
    String week[] = { "월", "화", "수", "목", "금", "토", "일" };
    int walk[] = { 87, 185, 3878, 2054, 174, 4197, 8584 };
    Color barColor = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
            (int) (Math.random() * 255.0));
    String msg = "버튼을 클릭해주세요.";
    String msg2 = "";

    int avgUseEvent;

    public HWSelfChart() {
        setLayout(null);
        int x = 35;
        JButton weekBtns[] = new JButton[7];
        // 버튼 넣기
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
        // g.fillRect(45, 100, 40, 240); // 월
        // g.fillRect(115, 200, 40, 230);
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += walk[i];
        }
        int avg = (int) (sum / (double) 7);
        avgUseEvent = avg;

        g.drawString(msg, 200, 420);
        g.drawString(msg2, 190, 450);
        // System.out.println("sum: " + sum);
        // 걸음수에 따른 막대 그래프 그리기 -> 걸음수의 비율을 이용하여서 막대 그래프를 그립니다.
        int x = 45;
        for (int i = 0; i < 7; i++) {
            int height = (int) (((walk[i] / (double) sum) * 200) * 2.65);
            g.fillRect(x, 340 - height, 40, height);
            x += 80;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jb = (JButton) e.getSource();
        String dif;
        int temp;
        switch (jb.getText()) {
            case "월":
                temp = avgUseEvent - walk[0];
                dif = (temp > 0) ? "-" + Integer.toString(Math.abs(temp)) : "+" + Integer.toString(Math.abs(temp));
                msg = jb.getText() + "요일 걸음 수는 " + walk[0] + "입니다.";
                msg2 = "평균과의 차이는 약 " + dif + "입니다. ";

                break;
            case "화":
                temp = avgUseEvent - walk[1];
                dif = (temp > 0) ? "-" + Integer.toString(Math.abs(temp)) : "+" + Integer.toString(Math.abs(temp));
                msg = jb.getText() + "요일 걸음 수는 " + walk[1] + "입니다.";
                msg2 = "평균과의 차이는 약 " + dif + "입니다. ";
                break;
            case "수":
                temp = avgUseEvent - walk[2];
                dif = (temp > 0) ? "-" + Integer.toString(Math.abs(temp)) : "+" + Integer.toString(Math.abs(temp));
                msg = jb.getText() + "요일 걸음 수는 " + walk[2] + "입니다.";
                msg2 = "평균과의 차이는 약 " + dif + "입니다. ";
                break;
            case "목":
                temp = avgUseEvent - walk[3];
                dif = (temp > 0) ? "-" + Integer.toString(Math.abs(temp)) : "+" + Integer.toString(Math.abs(temp));
                msg = jb.getText() + "요일 걸음 수는 " + walk[3] + "입니다.";
                msg2 = "평균과의 차이는 약 " + dif + "입니다. ";
                break;
            case "금":
                temp = avgUseEvent - walk[4];
                dif = (temp > 0) ? "-" + Integer.toString(Math.abs(temp)) : "+" + Integer.toString(Math.abs(temp));
                msg = jb.getText() + "요일 걸음 수는 " + walk[4] + "입니다.";
                msg2 = "평균과의 차이는 약 " + dif + "입니다. ";
                break;
            case "토":
                temp = avgUseEvent - walk[5];
                dif = (temp > 0) ? "-" + Integer.toString(Math.abs(temp)) : "+" + Integer.toString(Math.abs(temp));
                msg = jb.getText() + "요일 걸음 수는 " + walk[5] + "입니다.";
                msg2 = "평균과의 차이는 약 " + dif + "입니다. ";
                break;
            case "일":
                temp = avgUseEvent - walk[6];
                dif = (temp > 0) ? "-" + Integer.toString(Math.abs(temp)) : "+" + Integer.toString(Math.abs(temp));
                msg = jb.getText() + "요일 걸음 수는 " + walk[6] + "입니다.";
                msg2 = "평균과의 차이는 약 " + dif + "입니다. ";
                break;
        }
        barColor = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
                (int) (Math.random() * 255.0));
        repaint();

    }
}
