package Week7;

import java.awt.*;

public class GridDemoTwo {
    Frame f;
    List list;
    Panel panel;

    public GridDemoTwo() {
        f = new Frame();
        f.setLayout(new GridLayout(3, 2));

        f.add(new Button("1"));
        f.add(new TextField("22222", 10));
        f.add(new TextArea("333333", 5, 10));

        list = new List(5, false);
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        f.add(list);

        panel = new Panel();
        panel.setLayout(new BorderLayout());
        panel.add("North", new Button("north"));
        panel.add("East", new Button("east"));
        f.add(panel);
        f.add(new Label("6"));

        f.setSize(500, 400);
        f.setVisible(true);

    }
}
