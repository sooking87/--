
package Week12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextEventTest implements TextListener, ActionListener {
    TextArea edit;
    Button exit;
    Frame f;

    public TextEventTest(String msg) {
        // 프레임 세팅
        f = new JFrame(msg);
        f.setSize(300, 250);
        f.setVisible(true);

        // TextArea 이벤트 리스너 등록
        edit = new TextArea();
        edit.addTextListener(this);

        // Button 이벤트 리스너 등록
        exit = new Button("Exit");
        exit.addActionListener(this);

        // 프레임에서의 위치 설정
        f.add("Center", edit);
        f.add("South", exit);
    }

    // Button 이벤트 함수
    @Override
    public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
        f.dispose();
        System.exit(0);
    }

    // textArea 이벤트 함수
    @Override
    public void textValueChanged(TextEvent e) {
        System.out.println("Text Value 내용이 변경되었습니다.");
    }
}
