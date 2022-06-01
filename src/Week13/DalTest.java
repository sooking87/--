package Week13;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Graphics;

public class DalTest extends JFrame {
    Dal a, b, c, d;
    ImageIcon back, img1, img2, img3, img4;

    public DalTest() {
        super("Thread Test");

        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a = new Dal(this, 30, 215);
        b = new Dal(this, 30, 255);
        c = new Dal(this, 30, 300);
        d = new Dal(this, 30, 350);

        // (3)각 객체의 쓰레드 메소드(run)을 호출
        a.start();
        b.start();
        c.start();
        d.start();
    }

    public void paint(Graphics g) {
        img1 = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\src\\Images\\dog.png");
        img2 = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\src\\Images\\dog2.png");
        img3 = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\src\\Images\\dog3.png");
        img4 = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\src\\Images\\dog4.png");

        g.drawImage(img1.getImage(), a.x, a.y, null);
        g.drawImage(img2.getImage(), b.x, b.y, null);
        g.drawImage(img3.getImage(), c.x, c.y, null);
        g.drawImage(img4.getImage(), d.x, d.y, null);

    }
}
