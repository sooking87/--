package Week6;

import java.awt.*;

public class Checkbox2 extends Frame {
    Checkbox one;
    Checkbox two;
    Checkbox three;

    public Checkbox2() {
        super("CheckboxTest2");

        setLayout(new FlowLayout());

        one = new Checkbox("One");
        two = new Checkbox("Two");
        three = new Checkbox("Three");

        add(one);
        add(two);
        add(three);
        setSize(300, 200);
        setVisible(true);
    }

    public Checkbox2(String title) {
        super(title);

        setLayout(new FlowLayout());

        one = new Checkbox("One");
        two = new Checkbox("Two");
        three = new Checkbox("Three");

        add(one);
        add(two);
        add(three);
        setSize(300, 200);
        setVisible(true);
    }
}
