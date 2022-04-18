package Week7;

import java.awt.*;
import java.awt.event.*;

public class PopupDemo implements ActionListener { // Event 처리를 위한 인터페이스 상속
    Frame f;
    PopupMenu pm;
    Button b;
    Menu col;

    public PopupDemo() {
        f = new Frame("Popup Demo : SSK");
        pm = new PopupMenu("Pop up");
        b = new Button("POP UP Test");

        // Events을 받을 준비
        b.addActionListener(this);

        pm.add(new MenuItem("copy"));
        pm.add(new MenuItem("paste"));
        col = new Menu("color");
        col.add(new MenuItem("red"));
        col.add(new MenuItem("blue"));

        pm.add(col);

        b.add(pm);

        f.add(b, "Center");
        f.setSize(400, 400);
        f.setVisible(true);
    }

    // implementation for ActionListener
    // overriding
    public void actionPerformed(ActionEvent e) { // 이벤트 처리
        pm.show(b, 10, 10);
    }
}
