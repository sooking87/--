package Week12;

import javax.swing.*;

public class GradientTest extends JFrame {
    public GradientTest() {
        setSize(300, 330);
        setTitle("Java 2D gradient Test :: SSK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new GradientPanel();
        add(panel);
        setVisible(true);
    }
}
