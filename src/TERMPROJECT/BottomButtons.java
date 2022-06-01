package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BottomButtons extends JPanel {
    int panelNum = 0;

    public BottomButtons() {
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if ((x >= 100 && x <= 180) && (y >= 635 && y <= 675)) {
                    System.out.println(x + " " + y);
                    panelNum = movePanelPrev(panelNum);
                    System.out.println(panelNum);
                }

                if ((x >= 510 && x <= 590) && (y >= 635 && y <= 675)) {
                    System.out.println(x + " " + y);
                    panelNum = movePanelNext(panelNum);
                }

                System.out.println("move to panelNum: " + panelNum);
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 패널 이전 / 이후 버튼
        g.setColor(Color.GRAY);
        g.fillRoundRect(100, 635, 80, 40, 20, 20);
        g.fillRoundRect(510, 635, 80, 40, 20, 20);

        // 버튼 위에 그릴 문자
        g.setColor(Color.BLACK);
        g.setFont(new Font("굴림", Font.BOLD, 18));
        g.drawString("< 이전", 110, 660);
        g.drawString("이후 >", 525, 660);

        // 메뉴들이 들어있는 패널 3개라면
        // 현재 패널을 나타내기 위한 그래픽스 설정
        if (panelNum == 0) {
            g.setColor(Color.DARK_GRAY);
            g.fillOval(300, 650, 10, 10);
            g.setColor(Color.GRAY);
            for (int i = 1; i < 3; i++) {
                g.fillOval(i * 40 + 300, 650, 10, 10);
            }

        } else if (panelNum == 1) {
            g.setColor(Color.DARK_GRAY);
            g.fillOval(340, 650, 10, 10);
            g.setColor(Color.GRAY);
            g.fillOval(300, 650, 10, 10);
            g.fillOval(380, 650, 10, 10);
        } else {
            g.setColor(Color.DARK_GRAY);
            g.fillOval(380, 650, 10, 10);
            g.setColor(Color.GRAY);
            for (int i = 0; i < 2; i++) {
                g.fillOval(i * 40 + 300, 650, 10, 10);
            }
        }

    }

    public int movePanelNext(int pn) {
        if (++pn >= 3) {
            pn = 0;
        }
        return pn;
    }

    public int movePanelPrev(int pn) {
        if (--pn < 0) {
            pn = 2;
        }
        return pn;
    }
}
