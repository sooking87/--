package Week12;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class GradientPanel extends JPanel {
    Ellipse2D.Double circle;
    Rectangle2D.Double rect;
    GradientPaint gradient;

    public GradientPanel() {
        // (x1, y1) ~ (x2, y2)까지 red -> yellow 그라데이션이 진행됩니다.
        gradient = new GradientPaint(10, 10, Color.red, 200, 200, Color.yellow, true);
        circle = new Ellipse2D.Double(10, 10, 200, 200);
        rect = new Rectangle2D.Double(10, 10, 200, 200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(gradient);
        g2.fill(circle);
    }
}
