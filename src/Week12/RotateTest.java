
package Week12;

import javax.swing.*;

public class RotateTest extends JFrame {
    public RotateTest() {
        setSize(300, 330);
        setTitle("Java 2D Rotate Test :: SSK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new RotatePanel();
        add(panel);
        setVisible(true);
    }
}
