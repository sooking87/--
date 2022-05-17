package Week11;

import javax.swing.*;

public class ColorTest extends JFrame {
    public ColorTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setTitle("Color Test");
        JPanel panel = new ColorPanel();
        add(panel);
        setVisible(true);
    }
}
