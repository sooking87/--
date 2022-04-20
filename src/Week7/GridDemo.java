package Week7;

import java.awt.*;

public class GridDemo {
    Frame f;

    public GridDemo() {
        f = new Frame();
        f.setLayout(new GridLayout(2, 3));

        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));
        f.add(new Button("5"));
        f.add(new Button("6"));

        f.setSize(200, 400);
        f.setVisible(true);
    }
}
