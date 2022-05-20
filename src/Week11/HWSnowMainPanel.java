package Week11;

import java.awt.*;
import javax.swing.*;

public class HWSnowMainPanel extends JPanel {
    public HWSnowMainPanel() {
    }

    public void paintComponent(Graphics g) {
        // 눈사람 얼굴 만들기
        g.setColor(Color.WHITE);
        g.fillArc(150, 100, 180, 150, 0, 180); // 윗 부분
        g.fillOval(130, 160, 40, 40); // 왼쪽 볼
        g.fillOval(300, 150, 50, 50); // 오른쪽 볼

        int faceX[] = { 170, 130, 210, 250, 350 };
        int faceY[] = { 140, 180, 300, 300, 170 };
        g.fillPolygon(faceX, faceY, 5);

        // 눈 그리기
        g.setColor(Color.BLACK);
        g.drawOval(185, 140, 30, 30); // 왼쪽 눈 테두리
        g.drawOval(230, 135, 35, 35); // 오른쪽 눈 테두리
        g.fillOval(200, 145, 10, 15); // 왼쪽 눈 눈동자
        g.fillOval(244, 143, 12, 16); // 오른쪽 눈 눈동자

        // 코 그리기
        g.setColor(new Color(255, 127, 39));
        int noseX[] = { 215, 170, 240 };
        int noseY[] = { 160, 200, 180 };
        g.fillPolygon(noseX, noseY, 3);

        // 입 그리기
        g.setColor(Color.BLACK);
        g.drawArc(145, 150, 170, 70, 180, 180);

        // 모자 그리기
        // 모자 밑에 초록색 부분
        g.setColor(Color.BLACK);
        g.drawRoundRect(160, 80, 150, 50, 10, 10);
        g.setColor(new Color(0, 125, 0));
        g.fillRoundRect(160, 80, 150, 50, 10, 10);
        // 모자 위에 빨간 부분
        g.setColor(Color.RED);
        int hatX[] = { 300, 170, 300 };
        int hatY[] = { 20, 80, 80 };
        g.fillPolygon(hatX, hatY, 3);
        g.setColor(Color.WHITE);
        g.fillOval(295, 15, 20, 20);

        // 이 그리기
        g.setColor(Color.BLACK);
        g.drawLine(180, 215, 180, 240);
        g.drawLine(250, 218, 250, 240);
        g.drawLine(180, 240, 250, 240);

        // 중간 몸통 그리기
        g.setColor(Color.WHITE);
        g.fillRoundRect(160, 280, 150, 100, 60, 60);

        // 마지막 몸통 그리기
        g.fillRoundRect(100, 380, 280, 200, 120, 120);

        // 몸통 테두리 그리기
        g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(160, 280, 150, 100, 60, 60);
        g.drawRoundRect(100, 380, 280, 200, 120, 120);

        // 단추 그리기
        g.setColor(Color.DARK_GRAY);
        g.fillOval(210, 320, 30, 30);
        g.fillOval(210, 420, 30, 30);
        g.fillOval(210, 500, 30, 30);

        // 다리 그리기
        g.setColor(Color.WHITE);
        g.fillRoundRect(150, 580, 80, 40, 40, 30);
        g.fillRoundRect(230, 580, 80, 40, 40, 30);
        g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(150, 580, 80, 40, 40, 30);
        g.drawRoundRect(230, 580, 80, 40, 40, 30);

        // 팔 그리기
        g.setColor(Color.BLACK);
        // 왼팔
        g.drawLine(160, 320, 110, 250);
        g.drawLine(130, 280, 120, 245);
        g.drawLine(125, 270, 100, 270);
        // 오른팔
        g.drawLine(300, 320, 320, 420);
        g.drawLine(313, 380, 290, 410);
        g.drawLine(315, 390, 340, 410);

        // 배경에 눈 그리기
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * 500.0);
            int y = (int) (Math.random() * 800.0);

            g.setColor(Color.WHITE);
            g.fillOval(x, y, 5, 5);
        }

    }
}
