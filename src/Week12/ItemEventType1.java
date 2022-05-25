
package Week12;

//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.Graphics;
//import java.awt.geom.*;
//import java.io.*;
//import java.util.*;

public class ItemEventType1 implements ActionListener, ItemListener {
    JFrame f;
    JCheckBox one, two;
    JRadioButton male, female;
    ButtonGroup sex;
    JButton exit;
    JPanel n, s;

    public ItemEventType1(String msg) {
        // 프레임 생성
        f = new JFrame(msg);
        f.setSize(300, 200);
        f.setVisible(true);

        n = new JPanel(); // one, two 체크 박스 넣어줄 패널
        s = new JPanel(); // male, female 넣어줄 패널

        // 체크 박스 패널에 붙혀주기
        one = new JCheckBox("One");
        one.addItemListener(this); // 아이템 리스터 등록
        n.add(one);
        two = new JCheckBox("Two");
        two.addItemListener(this); // 아이템 리스터 등록
        n.add(two);

        exit = new JButton("Exit");
        exit.addActionListener(this);
        f.add("East", exit);

        male = new JRadioButton("Male");
        male.addItemListener(this); // 아이템 리스터 등록
        s.add(male);

        female = new JRadioButton("Female");
        female.addItemListener(this); // 아이템 리스터 등록
        s.add(female);

        f.add("North", n);
        f.add("South", s);

        // male, female을 버튼 그룹에 붙혀주기
        sex = new ButtonGroup();
        sex.add(male);
        sex.add(female);
    }

    // one, two 또는 male, female이 클릭된 경우
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object o = e.getSource();

        if (o == one) {
            System.out.println(e.getItem()); // one인 경우
        } else if (o == two) { // two인 경우
            if (e.getStateChange() == ItemEvent.SELECTED) { // two가 selected 되었다면
                System.out.println("two is selected");
            } else {
                System.out.println("two is deselected"); // selected 되지 않았다면
            }
        } else if (o == male) { // male이 체크되었다면
            System.out.println("Male selected");
        } else if (o == female) { // female이 체크되었다면
            System.out.println("Female selected");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
        f.dispose(); // ������ ����
        System.exit(0); // �ý��� ����
    }
}
