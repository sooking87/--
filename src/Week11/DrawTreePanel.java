package Week11;

import java.awt.*;
import javax.swing.*;

public class DrawTreePanel extends JPanel {
    public DrawTreePanel() {

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        drawTree(g, 400, 600, -90, 8);
    }

    // 재귀 함수를 이용하여서 트리를 그립니다.
    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) { // 최소 높이를 1로 잡습니다.
            return;
        }
        // 가지 끝에 그릴 다음 가지의 좌표를 구합니다.
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.drawLine(x1, y1, x2, y2); // 가지를 그립니다.
        // 재귀 함수를 통해서 다음 가지를 그립니다.
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);

    }

}
