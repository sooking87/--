package Week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HWPieChart extends JPanel implements ActionListener {

    JButton changeCol = new JButton("색상 변경");
    String totalSub[] = { "월요일(수업 4개)", "화요일(수업 2개)", "수요일(수업 4개)", "목요일(수업 2개)", "금요일(수업 없음)", "기타(수업 없음)" };
    Color totalSubCol[] = new Color[6];

    public HWPieChart() {
        setLayout(null);

        add(changeCol);
        changeCol.setBounds(80, 400, 120, 40);
        changeCol.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("돋움", Font.PLAIN, 18));
        g.drawString("<요일별 내가 듣는 강의 개수에 대한 원형차트>", 120, 30);

        // 색깔 별 이름 쓰기
        g.setFont(new Font("돋움", Font.PLAIN, 15));
        int y = 100; // 원 그리기 위한 좌표
        for (int i = 0; i < 6; i++) {
            totalSubCol[i] = new Color((int) (Math.random() * 255.0),
                    (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            g.setColor(totalSubCol[i]);
            g.fillOval(50, y, 24, 24);
            g.setColor(Color.BLACK);
            g.drawString(totalSub[i], 80, y + 16);
            y += 30;
        }

        // 월요일 원형 차트 부분
        g.setColor(totalSubCol[0]);
        g.fillArc(270, 100, 300, 300, 90, -120);

        // 화요일 원형 차트 부분
        g.setColor(totalSubCol[1]);
        g.fillArc(270, 100, 300, 300, 330, -60);

        // 수요일 원형 차트 부분
        g.setColor(totalSubCol[2]);
        g.fillArc(270, 100, 300, 300, 270, -120);

        // 목요일 원형 차트 부분
        g.setColor(totalSubCol[3]);
        g.fillArc(270, 100, 300, 300, 150, -60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 6; i++) {
            totalSubCol[i] = new Color((int) (Math.random() * 255.0),
                    (int) (Math.random() * 255.0), (int) (Math.random() * 255.0));
            repaint();
        }
    }
}
