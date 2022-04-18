package Week7;

import java.awt.*;

public class PanelDemo {
    Frame f;
    Panel p;

    ublic PanelDemo() {
        f = new Frame();
        f.setLayout(null);

        p = new Panel();
        p.setSize(200, 200);
        p.setBackground(Color.red);
        p.setLocation(100, 100);

        f.add(p);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
