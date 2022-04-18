package Week7;

import java.awt.*;

public class ScrollPaneTest {
    Frame f;
    ScrollPane sp;
    Panel mp, bp;
    TextArea ta;
    Button ok, cancel;

    public ScrollPaneTest() {
        f = new Frame("ScrollPane Demo : SSK");
        sp = new ScrollPane();
        sp.setSize(200, 200);

        mp = new Panel();
        bp = new Panel();
        ta = new TextArea();
        ok = new Button("OK");
        cancel = new Button("Cancel");

        mp.add(ta);
        sp.add(mp);

        bp.add(ok);
        bp.add(cancel);

        f.add(sp, "Center");
        f.add(bp, "South");
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
