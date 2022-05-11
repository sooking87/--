package Week11;

import javax.swing.*;

public class LineShapes extends JFrame {
    public LineShapes() {
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Poly-Line Shapes");

        MyShapePanel panel = new MyShapePanel();
        add(panel);
        setVisible(true);
    }
}
