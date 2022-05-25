
package Week12;

import java.awt.*;
import java.awt.event.*;

public class ButtonEvent implements ActionListener {
    Frame f;
    Button test, exit;

    public ButtonEvent(String msg) {
        // 프레임 생성
        f = new Frame(msg);

        // 버튼 생성 및 이벤트 리스너 등록
        test = new Button("Test");
        test.addActionListener(this);

        exit = new Button("Exit");
        exit.addActionListener(this);

        // 프레임에 추가
        f.add("North", test);
        f.add("South", exit);

        f.setSize(300, 200);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == test) { // test 버튼이 클릭되었다면
            System.out.println("Button Event Test Message"); // 출력
        } else if (e.getSource() == exit) { // exit 버튼이 클릭되었다면
            f.setVisible(false); // 보여지지 않도록 함.
            f.dispose();
            System.exit(0);
        }
    }
}
