package Week12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class DrawEvent extends JPanel {
    int startX = 0, startY = 0, w = 0, h = 0;
    JPanel jp;

    public void DrawEvent() {
    }

    void drawPanel() {
        addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e) {
                startX = Math.abs(e.getX());
                startY = e.getY();
            }

            public void mouseReleased(MouseEvent e) {
                w = Math.abs(startX - e.getX());
                h = Math.abs(startY - e.getY());
                repaint();
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub

            }

        });

        addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                w = Math.abs(startX - e.getX());
                h = Math.abs(startY - e.getY());
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(startX, startY, w, h);
        drawPanel();
    }
}
