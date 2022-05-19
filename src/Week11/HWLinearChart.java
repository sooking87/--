package Week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HWLinearChart extends JPanel implements ActionListener {
    JButton changeCol = new JButton("색상 변경");
    String week[] = { "월요일", "화요일", "수요일", "목요일", "금요일", "기타(싸강)" };
    String totalSub[] = { "(수업 4개)", "(수업 2개)", "(수업 없음)" };
    String majorSub[] = { "(전공 3개)", "(전공 1개)" };
    int axisY[] = { 90, 178, 266, 354, 445 }; // 인덱스 0 -> 4개일 때 y 좌표, 1 -> 3개일 때 y 좌표, ,,, 4 -> 0개일 때 y 좌표

    // 버튼 구현 전 일단 랜덤으로 색깔 구분
    Color totalSubCol = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
            (int) (Math.random() * 255.0));
    Color majorSubCol = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
            (int) (Math.random() * 255.0));

    public HWLinearChart() {
        setLayout(null);

        add(changeCol);
        changeCol.setBounds(400, 100, 120, 40);
        changeCol.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 제목 설정
        g.setFont(new Font("돋움", Font.PLAIN, 18));
        g.drawString("<요일별 듣는 강의 개수와 전공강의 개수에 대한 선형 차트>", 60, 30);

        // x축, y축 그리기
        g.drawLine(30, 450, 550, 450); // x축
        g.drawLine(30, 70, 30, 450); // y축
        // 좌표 이름 쓰기
        g.setFont(new Font("돋움", Font.PLAIN, 15));
        int x = 60;
        for (int i = 0; i < 6; i++) {
            g.drawString(week[i], x, 470);
            x += 80;
        }

        // 해당 요일의 수업 및 전공 수업 개수에 대한 "점" 찍기 & "선" 그리기 & "문자열" 그리기
        for (int day = 1; day <= 6; day++) { // day == 1 : 월요일
            if (day != 6) { // 선 그리기 위한 조건식 -> day == 2부터 선을 그린다.
                if (day == 1 || day == 3) {
                    // 수업 4개 / 전공 3개
                    g.setColor(totalSubCol); // 해당 색깔에 맞게
                    g.fillOval(75 + (day - 1) * 80, axisY[0], 8, 8); // 점을 찍고
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[0] + 4, 75 + day * 80 + 4, axisY[2] + 4); // 직선을 그리고
                    // +4 : 지름이 8인 원의 중심끼리 선을 연결하기 위해서
                    g.drawString(totalSub[0], 75 + (day - 1) * 80 - 25, axisY[0] - 10); // 문자열을 그린다.

                    g.setColor(majorSubCol);
                    g.fillOval(75 + (day - 1) * 80, axisY[1], 8, 8);
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[1] + 4, 75 + day * 80 + 4, axisY[3] + 4);
                    g.drawString(majorSub[0], 75 + (day - 1) * 80 - 25, axisY[1] + 30); // 문자열을 그린다.
                } else if (day == 2) {
                    // 수업 2개 / 전공 1개
                    g.setColor(totalSubCol);
                    g.fillOval(75 + (day - 1) * 80, axisY[2], 8, 8);
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[2] + 4, 75 + day * 80 + 4, axisY[0] + 4);
                    g.drawString(totalSub[1], 75 + (day - 1) * 80 - 25, axisY[2] - 10); // 문자열을 그린다.

                    g.setColor(majorSubCol);
                    g.fillOval(75 + (day - 1) * 80, axisY[3], 8, 8);
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[3] + 4, 75 + day * 80 + 4, axisY[1] + 4);
                    g.drawString(majorSub[1], 75 + (day - 1) * 80 - 25, axisY[3] + 30); // 문자열을 그린다.

                } else if (day == 4) {
                    // 수업 2개 / 전공 1개
                    g.setColor(totalSubCol);
                    g.fillOval(75 + (day - 1) * 80, axisY[2], 8, 8);
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[2] + 4, 75 + day * 80 + 4, axisY[4] + 4);
                    g.drawString(totalSub[1], 75 + (day - 1) * 80 - 25, axisY[2] - 10); // 문자열을 그린다.

                    g.setColor(majorSubCol);
                    g.fillOval(75 + (day - 1) * 80, axisY[3], 8, 8);
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[3] + 4, 75 + day * 80 + 4, axisY[4] + 4);
                    g.drawString(majorSub[1], 75 + (day - 1) * 80 - 25, axisY[3] + 30); // 문자열을 그린다.
                } else {
                    // 수업 없음 / 전공 없음
                    g.setColor(totalSubCol);
                    g.fillOval(75 + (day - 1) * 80, axisY[4], 8, 8);
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[4] + 4, 75 + day * 80 + 4, axisY[4] + 4);
                    g.drawString(totalSub[2], 75 + (day - 1) * 80 - 25, axisY[4] - 10); // 문자열을 그린다.

                    g.setColor(majorSubCol);
                    g.fillOval(75 + (day - 1) * 80, axisY[4], 8, 8);
                    g.drawLine(75 + (day - 1) * 80 + 4, axisY[4] + 4, 75 + day * 80 + 4, axisY[4] + 4);
                }

            } else {
                // 수업 없음 / 전공 없음
                g.setColor(totalSubCol);
                g.fillOval(75 + (day - 1) * 80, axisY[4], 8, 8);
                g.drawLine(75 + (day - 1) * 80 + 4, axisY[4] + 4, 75 + day * 80 + 4, axisY[4] + 4);
                g.drawString(totalSub[2], 75 + (day - 1) * 80 - 25, axisY[4] - 10); // 문자열을 그린다.

                g.setColor(majorSubCol);
                g.fillOval(75 + (day - 1) * 80, axisY[4], 8, 8);
                g.drawLine(75 + (day - 1) * 80 + 4, axisY[4] + 4, 75 + day * 80 + 4, axisY[4] + 4);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        totalSubCol = new Color((int) (Math.random() * 255.0),
                (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        majorSubCol = new Color((int) (Math.random() * 255.0),
                (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
        repaint();

    }
}
