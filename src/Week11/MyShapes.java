package Week11;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MyShapes extends JPanel {
    ArrayList<Shape> shapeArray = new ArrayList<Shape>();

    public MyShapes() {
        Shape s;

        // 사각형 만들기
        s = new Rectangle2D.Float(10, 10, 70, 80);
        shapeArray.add(s);

        // 둥근 사각형
        s = new RoundRectangle2D.Float(110, 10, 70, 80, 20, 20);
        shapeArray.add(s);

        // 타원
        s = new Ellipse2D.Float(210, 10, 80, 80);
        shapeArray.add(s);

        // 원호 : Arc2D.OPEN
        s = new Arc2D.Float(310, 10, 80, 80, 90, 90, Arc2D.OPEN);

        // 원호 : Arc2D.CHORD
        s = new Arc2D.Float(410, 10, 80, 80, 0, 180, Arc2D.CHORD);
        shapeArray.add(s);

        // 원호 : Arc2D.PIE
        s = new Arc2D.Float(510, 10, 80, 80, 45, 90, Arc2D.PIE);
        shapeArray.add(s);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics g2 = (Graphics2D) g;

        ((Graphics2D) g2).setRenderingHeni(ReaderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLACK);
        ((Graphics2D) g2).setStroke(new BasicStroke(5));
        for (Shape s : shapeArray)
            ((Graphics2D) g2).draw(s);
    }
}
