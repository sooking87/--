package Week11;

import javax.swing.*;
import java.awt.*;

public class HWPieChart extends JPanel {
    public HWPieChart() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("돋움", Font.PLAIN, 18));
        g.drawString("<요일별 내가 듣는 강의 개수에 대한 원형차트>", 120, 30);

    }
}
