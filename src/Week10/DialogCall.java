package Week10;

import java.awt.event.*;
import javax.swing.*;

public class DialogCall extends JFrame {
    MyDialog dialog;
    JButton btn;

    public DialogCall() {
        super("Jdialog Example :: SSK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // btn과 dialog 객체 생성
        btn = new JButton("Show Dialog");
        dialog = new MyDialog(this, "Test Dialog");

        // 다이얼로그를 띄우기 위해서는 이벤트처리가 필요합니다.
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        // Main을 통해서 나오는 윈도우에 버튼만 붙혀줍니다.
        getContentPane().add(btn);
        setSize(300, 300);
        setVisible(true);
    }

}
