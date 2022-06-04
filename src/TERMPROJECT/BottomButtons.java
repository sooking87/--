package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BottomButtons extends JPanel {
    private int panelNum = 0;

    public BottomButtons() {
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if ((x >= 80 && x <= 160) && (y >= 500 && y <= 540)) {
                    panelNum = movePanelPrev(panelNum);
                }

                if ((x >= 530 && x <= 610) && (y >= 500 && y <= 540)) {
                    panelNum = movePanelNext(panelNum);
                }

                setPanelNum(panelNum);
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 패널 이전 / 이후 버튼
        g.setColor(Color.GRAY);
        g.fillRoundRect(80, 500, 80, 40, 20, 20);
        g.fillRoundRect(530, 500, 80, 40, 20, 20);

        // 버튼 위에 그릴 문자
        g.setColor(Color.BLACK);
        g.setFont(new Font("굴림", Font.BOLD, 18));
        g.drawString("< 이전", 90, 525);
        g.drawString("이후 >", 545, 525);

        // 메뉴들이 들어있는 패널 3개라면
        // 현재 패널을 나타내기 위한 그래픽스 설정
        if (panelNum == 0) {
            g.setColor(Color.BLACK);
            g.fillOval(320, 515, 10, 10);
            g.setColor(Color.GRAY);
            g.fillOval(360, 515, 10, 10);

        } else {
            g.setColor(Color.BLACK);
            g.fillOval(360, 515, 10, 10);
            g.setColor(Color.GRAY);
            g.fillOval(320, 515, 10, 10);
        }

    }

    public int movePanelNext(int pn) {
        if (++pn >= 2) {
            pn = 0;
        }
        return pn;
    }

    public int movePanelPrev(int pn) {
        if (--pn < 0) {
            pn = 1;
        }
        return pn;
    }

    public void setPanelNum(int panelNum) {
        this.panelNum = panelNum;
    }

    public int getPanelNum() {
        return panelNum;
    }
}
