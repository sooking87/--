package TERMPROJECT;

import javax.swing.JDialog;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PayOptionCheck extends JDialog {
    Order or;
    IntroPanel intro;
    // 쓰레드와 라벨관련 패널 및 컴포
    JPanel notice;
    JLabel sec, ment;
    PayThread th;
    JLabel ques;
    JPanel buttons;
    JButton ok, cancel;

    public PayOptionCheck(Order or, IntroPanel intro) {
        this.or = or;
        this.intro = intro;
        setLayout(null);
        setSize(500, 300);

        // 30초 후 결제창이 종료됩니다.
        notice = new JPanel();
        sec = new JLabel("초 후 ");
        ment = new JLabel("결제창이 종료됩니다.");
        th = new PayThread(this);
        notice.add(th);
        notice.add(sec);
        notice.add(ment);
        notice.setBounds(150, 50, 200, 50);
        add(notice);

        // 결제하시겠습니까?
        ques = new JLabel("결제하시겠습니까?");
        ques.setFont(new Font("굴림", Font.ITALIC, 20));
        ques.setBounds(160, 100, 200, 50);
        add(ques);

        // 예 / 아니오 버튼
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 2, 30, 0));
        ok = new JButton("예");
        ok.setFont(new Font("굴림", Font.BOLD, 15));
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                or.setVisible(false);
                PayDone done = new PayDone();
                done.setLocation(180, 350);
                done.setVisible(true);
                intro.setVisible(true);
            }
        });
        buttons.add(ok);
        cancel = new JButton("아니오");
        cancel.setFont(new Font("굴림", Font.BOLD, 15));
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });
        buttons.add(cancel);
        buttons.setBounds(100, 150, 300, 30);
        add(buttons);

    }
}
