package Week6;

import java.awt.*;

public class ButtonTestwithFrame extends Frame {
    Button ok;
    Label label;

    ButtonTestwithFrame() {
        super("Button Test extend Frame: SSK");

        setLayout(new FlowLayout());
        ok = new Button("OK");
        label = new Label("저는 라벨");

        add(ok);
        add(label);
        setSize(500, 300);
        setVisible(true);
    }

    ButtonTestwithFrame(String title) {
        super(title);

        setLayout(new FlowLayout());
        ok = new Button("OK");
        label = new Label("저는 라벨");

        add(ok);
        add(label);
        setSize(500, 300);
        setVisible(true);
    }
}
