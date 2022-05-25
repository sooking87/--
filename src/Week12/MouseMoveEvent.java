package Week12;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;

public class MouseMoveEvent extends JPanel {
    BufferedImage img = null;
    int img_x = 0, img_y = 0;

    public MouseMoveEvent() {
        // car img 가져오기 (tru-catch 필수)
        try {
            img = ImageIO.read(new File("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog.png"));
        } catch (IOException e) {
            System.out.println("no image");
            System.exit(1);
        }

        // jPanel에 대한 KeyEvent 등록
        addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}
