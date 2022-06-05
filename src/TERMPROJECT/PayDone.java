package TERMPROJECT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PayDone extends JDialog {
    JLabel fin;
    JButton ok;

    public PayDone() {
        setLayout(null);
        setSize(300, 200);

        // 결제되었습니다.
        fin = new JLabel("결제되었습니다.");
        fin.setFont(new Font("굴림", Font.ITALIC, 15));
        fin.setBounds(80, 30, 150, 50);
        add(fin);

        // 확인 버튼
        ok = new JButton("확인");
        ok.setFont(new Font("굴림", Font.PLAIN, 10));
        ok.setBounds(100, 80, 60, 50);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        add(ok);
    }
}
