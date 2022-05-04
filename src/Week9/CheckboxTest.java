package Week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxTest extends JPanel implements ItemListener {
    JCheckBox[] buttons = new JCheckBox[3];
    String[] fruits = { "apple", "grape", "pear" };
    JLabel[] pictureLabel = new JLabel[3];
    ImageIcon[] icon = new ImageIcon[3];
    JPanel checkPanel;

    public CheckboxTest() {
        super(new GridLayout(0, 4));

        // 체크 박스 생성
        for (int i = 0; i < 3; i++) {
            buttons[i] = new JCheckBox(fruits[i]);
            buttons[i].addItemListener(this); // 이벤트 리스너
            pictureLabel[i] = new JLabel(fruits[i] + ".png");
            icon[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\" + fruits[i] + ".png");
        }

        // 패널에 버튼 3개 붙히기
        checkPanel = new JPanel(new GridLayout(0, 1));
        for (int i = 0; i < 3; i++) {
            checkPanel.add(buttons[i]);
        }

        add(checkPanel);
        add(pictureLabel[0]);
        add(pictureLabel[1]);
        add(pictureLabel[2]);

        setSize(500, 500);
        setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {
        ImageIcon image = null;

        Object source = e.getItemSelectable();
        System.out.println(source);

        for (int i = 0; i < 3; i++) {
            if (source == buttons[i]) {
                if (e.getStateChange() == ItemEvent.DESELECTED) {
                    pictureLabel[i].setIcon(null);
                } else {
                    pictureLabel[i].setIcon(icon[i]);
                }
            }
        }
    }
}
