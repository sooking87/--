package Week11;

import javax.swing.*;

public class DrawTree extends JFrame {
    publid DrawTree(String msg) {
        setTitle(msg);
        add(new DrawTreePanel());
        setSize(500, 400);
        setVisible(true);
    }
}
