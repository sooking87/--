
package Week12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventType1 {
    JFrame jf;
    JPanel panel;
    JButton btn1;
    JButton btn2;

    MyListener listener = new MyListener();

    public ButtonEventType1(String msg) {
        // 프레임 생성
        jf = new JFrame(msg);
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle(msg);

        // Yellow 버튼과 Pink 버튼을 붙혀줄 패널 생성
        panel = new JPanel();

        btn1 = new JButton("Yellow");
        btn1.addActionListener(listener); // 버튼 이벤트 리스너 등록
        panel.add(btn1);

        btn2 = new JButton("Pink");
        btn2.addActionListener(listener); // 버튼 이벤트 리스너 등록
        panel.add(btn2);

        jf.add(panel);
        jf.setVisible(true);
    }

    // 버튼 이벤트 함수
    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn1) { // btn1을 눌렀을 때
                panel.setBackground(Color.YELLOW); // 배경색 노란색으로
            }

            else if (e.getSource() == btn2) { // btn2를 눌렀을 때
                panel.setBackground(Color.PINK); // 배경색 핑크색으로
            }

        }
    }
}
