package Week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HWBarChart extends JPanel implements ActionListener {
    JButton changeCol = new JButton("색상 변경");
    String totalSub[] = { "월(4개)", "화(2개)", "수(4개)", "목(2개)", "금(0개)", "싸강(0개)" };
    Color totalSubCol[] = new Color[6];
    int axisY[] = { 90, 266, 445 }; // 인덱스 0 -> 4개일 때 y 좌표, 1 -> 3개일 때 y 좌표, ,,, 4 -> 0개일 때 y 좌표

    public HWBarChart() {
        setLayout(null);

        add(changeCol);
        changeCol.setBounds(400, 100, 120, 40);
        changeCol.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("돋움", Font.PLAIN, 18));
        g.drawString("<요일별 내가 듣는 강의 개수에 대한 막대차트>", 130, 30);

        // x축, y축 그리기
        g.drawLine(30, 450, 550, 450); // x축
        g.drawLine(30, 70, 30, 450); // y축
        // y 축 위에 선 그리기
        g.drawLine(20, axisY[0], 40, axisY[0]);
        g.drawLine(20, axisY[1], 40, axisY[1]);

        // 좌표 이름 쓰기
        g.setFont(new Font("돋움", Font.PLAIN, 15));
        int x = 60;
        for (int i = 0; i < 6; i++) {
            g.drawString(totalSub[i], x, 470);
            x += 80;
        }

        // 처음 출력되는 값 역시 랜덤 컬러로 출력하기 위한 반복문
        for (int i = 0; i < 6; i++) {
            totalSubCol[i] = new Color((int) (Math.random() * 255.0),
                    (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        }

        g.setColor(totalSubCol[0]);
        g.fillRect(65, axisY[0], 40, 360); // 월요일: 4개

        g.setColor(totalSubCol[1]);
        g.fillRect(145, axisY[1], 40, 184); // 화요일: 2개

        g.setColor(totalSubCol[2]);
        g.fillRect(225, axisY[0], 40, 360); // 수요일: 4개

        g.setColor(totalSubCol[3]);
        g.fillRect(305, axisY[1], 40, 184); // 목요일: 2개

        g.setColor(totalSubCol[4]);
        g.fillRect(385, axisY[2], 40, 5); // 금요일: 0개

        g.setColor(totalSubCol[5]);
        g.fillRect(465, axisY[2], 40, 5); // 싸강: 0개
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 6; i++) {
            totalSubCol[i] = new Color((int) (Math.random() * 255.0),
                    (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            repaint();
        }
    }
}
