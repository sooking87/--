package Week11;

import javax.swing.*;

public class BasicPaint {
    JFrame f;

    public BasicPaint(String msg) {
        f = new JFrame(msg); // 벽을 만든다.
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 그리기 위한 Panel 생성
        MyPanel1 mypanel1 = new MyPanel1();

        // mypanel1 붙히기
        f.add(mypanel1);

        f.setSize(500, 500);
        f.setVisible(true);
    }
}
