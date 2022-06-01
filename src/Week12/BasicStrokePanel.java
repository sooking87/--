package Week12;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class BasicStrokePanel extends JPanel {
    Rectangle2D.Double rect;
    Ellipse2D.Double circle;

    public BasicStrokePanel() {
        rect = new Rectangle2D.Double(20, 20, 220, 220);
        circle = new Ellipse2D.Double(20, 20, 220, 220);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2)); // 선 두꼐가 2로 설정
        g2.draw(rect);
        float[] dashPattern = { 30, 10, 10, 10 };
        // 선 두께: 8, 끝점의 모양: CAP_BUTT, 꼭짓점의 모양: JOIN_MITER, 꼭짓점 길이의 한계: 10,
        // dashPattern을 점선으로 가지고 점선간의 공백 거리를 dash_phase로 설정한 원을 만들어줍니다.
        g2.setStroke(new BasicStroke(8, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, dashPattern, 0));
        g2.draw(circle);
    }
}
