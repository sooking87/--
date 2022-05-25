package Week12;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;

public class KeyTypeEvent extends JPanel {
    BufferedImage img = null;
    int img_x = 1, img_y = 1;

    public KeyTypeEvent() {
        // car img 가져오기 (tru-catch 필수)
        try {
            img = ImageIO.read(new File("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog.png"));
        } catch (IOException e) {
            System.out.println("no image");
            System.exit(1);
        }

        // jPanel에 대한 KeyEvent 등록
        addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode(); // key의 방향
                switch (keycode) {
                    case KeyEvent.VK_UP:
                        img_y -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        img_y += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        img_x -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        img_x += 10;
                        break;
                }
                repaint();
            }

            public void keyReleased(KeyEvent arg0) {
            }

            public void keyTyped(KeyEvent arg1) {
            }
        });
        this.requestFocus(); // Key event를 받을 컴포넌트를 강제로 설정
        setFocusable(true); // Key event를 Focus를 받을 수 있도록 설정
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}
