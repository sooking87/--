package Week7;

import java.awt.*;

public class BorderTestOne {
    Frame f;

    public BorderTestOne() {
        f = new Frame("Border Test One");

        f.setLayout(new BorderLayout(5, 5));

        f.add("North", new Button("North"));
        f.add("Center", new Button("Center"));
        f.add("South", new Button("South"));
        f.add("West", new Button("West"));
        f.add("East", new Button("East"));

        f.setSize(500, 300);
        f.setVisible(true);
    }
}
