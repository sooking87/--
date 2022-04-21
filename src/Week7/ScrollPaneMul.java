package Week7;

import java.awt.*;

public class ScrollPaneMul {
    Frame f;
    ScrollPane sp, sp2;
    Panel mp, mp2, bp;
    TextArea one, two;
    Button ok, cancel;

    public ScrollPaneMul() {
        f = new Frame("ScrollPaneMUL Demo : SSK");
        f.setLayout(new FlowLayout());
        sp = new ScrollPane();
        sp2 = new ScrollPane();
        sp.setSize(200, 200);
        sp2.setSize(200, 200);

        mp = new Panel();
        mp2 = new Panel();
        bp = new Panel();
        one = new TextArea();
        two = new TextArea();
        ok = new Button("OK");
        cancel = new Button("Cancel");

        mp.add(one);
        mp2.add(two);
        sp.add(mp);
        sp2.add(mp2);

        bp.add(ok);
        bp.add(cancel);

        f.add(sp);
        f.add(sp2);
        f.add(bp);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
