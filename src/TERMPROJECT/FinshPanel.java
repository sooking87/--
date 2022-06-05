package TERMPROJECT;

import java.awt.*;

public class FinshPanel extends IntroPanel {
    public FinshPanel() {
        super.setVisible(true);
        // setBackground(Color.RED);
        System.out.println("finshPanel 들어옴");
        repaint();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("굴림", Font.ITALIC, 30));
        g.drawString("[결제가 완료되었습니다.]", 100, 800);

    }
}
