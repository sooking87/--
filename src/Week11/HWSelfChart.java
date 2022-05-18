package Week11;

import javax.swing.*;
import java.awt.*;

public class HWSelfChart extends JPanel {
    public HWSelfChart() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("돋움", Font.PLAIN, 18));
        g.drawString("<나만의 차트->", 130, 30);

    }
}
