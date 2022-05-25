package Week12;

import javax.swing.*;

public class BasicStrokeTest extends JFrame {
    public BasicStrokeTest() {
        setSize(300, 330);
        setTitle("Java 2D BasicStroke Test :: SSK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new BasicStrokePanel();
        add(panel);
        setVisible(true);
    }
}
