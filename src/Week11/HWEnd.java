package Week11;

import java.awt.*;
import javax.swing.*;

public class HWEnd extends JPanel {
    ImageIcon icon = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\smile.png");
    Image img = icon.getImage();

    public HWEnd() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 150, 50, 300, 300, this);

        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("Thank You", 230, 400);
    }
}
