package Week6;

import java.awt.*;

public class TextDemo {
    Frame f;
    TextArea text;

    public TextDemo() {
        f = new Frame("TextDemo");
        f.setLayout(new FlowLayout());

        text = new TextArea("Hello", 5, 50); // text, row, col
        f.add(text);
        char c = '*';

        TextField field = new TextField(30);
        field.setEchoChar(c);
        f.add(field);

        f.setSize(300, 200);
        f.setVisible(true);

    }
}
