package Week6;

import java.awt.*;

public class LabelTestNew {
    Frame f;

    // 이러한 클래스를 만들어서 생성자의 초기화가 있는 것과 없는 것을 만들어서 항상 메인에서는 불러오도록 만들어야 된다.
    // 생성자 1
    LabelTestNew() {
        f = new Frame("Label Test: Sohn");
        Label l = new Label("IT Dept. Sohn Soo Kyoung");

        // 라벨을 프레임에 붙히다.
        f.add(l);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    // 생성자 2
    LabelTestNew(String title) {
        f = new Frame(title);
        Label l = new Label("IT Dept. Sohn Soo Kyoung");

        // 라벨을 프레임에 붙히다.
        f.add(l);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
