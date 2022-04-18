package Week6;

import java.awt.*;

public class ButtonTestnoextendsFrame {
    Button ok;
    Label label;

    ButtonTestnoextendsFrame() {
        Frame f = new Frame("Button Test NO extend Frame: SSK");

        f.setLayout(new FlowLayout());
        ok = new Button("OK");
        label = new Label("저는 라벨");

        f.add(ok);
        f.add(label);
        f.setSize(500, 300);
        f.setVisible(true);
    }

    ButtonTestnoextendsFrame(String title) {
        Frame f = new Frame(title);

        f.setLayout(new FlowLayout());
        ok = new Button("OK");
        label = new Label("저는 라벨");

        f.add(ok);
        f.add(label);
        f.setSize(500, 300);
        f.setVisible(true);
    }
}
