package SelfWeek6;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    Frame f;
    Button one;
    Button two;
    Button three;

    public BorderLayoutDemo() {
        super("BorderLayout Sample");
        setLayout(new BorderLayout(30, 0));

        one = new Button("One");
        two = new Button("Two");
        three = new Button("Three");
        add(one, BorderLayout.EAST);
        add(two, BorderLayout.CENTER);
        add(three, BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }
}
