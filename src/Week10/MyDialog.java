package Week10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyDialog extends JDialog {
    JTextField tf;
    JButton ok;

    public MyDialog(JFrame frame, String title) {
        super(frame, title);
        setLayout(new FlowLayout());

        // JTextField 를 생성하며 다이얼로그에 붙힙니다.
        tf = new JTextField(20);
        add(tf);

        // JButton을 생성하여 다이얼로그에 붙힙니다.
        ok = new JButton("OK");
        add(ok);

        setSize(200, 200);

        // 다이얼 로그에 OK 버튼을 누르면 다이얼로그가 보이지 않도록 이벤트 처리를 해줍니다.
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
