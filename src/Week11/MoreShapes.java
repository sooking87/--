package Week11;

import javax.swing.*;

public class MoreShapes extends JFrame {
    public MoreShapes(String msg) {
        setSize(600, 130);
        setTitle(msg);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new MoreShapesPanel();
        add(panel);
        setVisible(true);
    }
}
