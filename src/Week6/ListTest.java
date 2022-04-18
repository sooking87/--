package Week6;

import java.awt.*;

public class ListTest {
    public ListTest() {
        Frame f = new Frame("ListTest");

        f.setLayout(new FlowLayout());
        List list = new List(6, true);
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");

        f.add(list);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
