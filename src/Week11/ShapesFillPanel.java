package Week11;

import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.*;
import javax.swing.JPanel;

public class ShapesFillPanel extends JPanel {
    ArrayList<Shape> shapeArray = new ArrayList<Shape>();

    public ShapesFillPanel() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(3));
        GradientPaint gp = new GradientPaint(0, 10, Color.WHITE, 0, 70, Color.RED);

        g2.setPaint(Color.RED);
        g2.fill(new Rectangle2D.Float(10, 10, 70, 80)); // 사각형

        g2.setPaint(gp);
        g2.fill(new RoundRectangle2D.Float(110, 10, 70, 80, 20, 20)); // 둥근 사각형

        g2.setPaint(Color.RED);
        g2.fill(new Ellipse2D.Float(210, 10, 80, 80)); // 타원

        g2.setPaint(gp);
        g2.fill(new Arc2D.Float(310, 10, 80, 80, 45, 225, Arc2D.OPEN)); // 원호 : Arc2D.OPEN

        g2.setPaint(Color.RED);
        g2.fill(new Arc2D.Float(410, 10, 80, 80, 45, 225, Arc2D.CHORD)); // 원호 : Arc2D.CHORD

        g2.setPaint(gp);
        g2.fill(new Arc2D.Float(510, 10, 80, 80, 45, 225, Arc2D.PIE)); // 원호 : Arc2D.PIE

    }
}
