package Week6;

import java.awt.*;

public class ChoiceTest {
    public ChoiceTest(String msg) {
        Frame f = new Frame(msg);

        f.setLayout(new FlowLayout());
        Choice choice = new Choice();
        choice.add("One");
        choice.add("Two");
        choice.add("Three");
        choice.add("Four");
        choice.add("Five");
        choice.add("Six");

        f.add(choice);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
