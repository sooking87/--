package Week7;

import java.awt.*;

public class FlowTestOne extends Frame {

    public FlowTestOne() {
        super("FlowTestOne");
        setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 1));

        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("7")).setVisible(false);
        ;
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("0"));

        setSize(300, 200);
        setVisible(true);
    }
}
