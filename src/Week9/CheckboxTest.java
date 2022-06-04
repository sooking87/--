package Week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxTest extends JFrame implements ItemListener {
    Container c = getContentPane();
    JPanel jp = new JPanel();
    JCheckBox[] buttons = new JCheckBox[3];
    String[] fruits = { "apple", "grape", "pear" };
    JLabel[] pictureLabel = new JLabel[3];
    ImageIcon[] icon = new ImageIcon[3];
    JPanel checkPanel;

    public CheckboxTest() {
        super("checkBox Test : SSK");
        c.setLayout(new GridLayout(0, 4));

        // 체크 박스 생성
        for (int i = 0; i < 3; i++) {
            buttons[i] = new JCheckBox(fruits[i]);
            buttons[i].addItemListener(this); // 이벤트 리스너
            pictureLabel[i] = new JLabel(fruits[i] + ".png");
            icon[i] = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\" + fruits[i] + ".png");
            icon[i] = imageSetSize(icon[i], 200, 200);
        }

        // 패널에 버튼 3개 붙히기
        checkPanel = new JPanel(new GridLayout(0, 1));
        for (int i = 0; i < 3; i++) {
            checkPanel.add(buttons[i]);
        }

        c.add(checkPanel);
        c.add(pictureLabel[0]);
        c.add(pictureLabel[1]);
        c.add(pictureLabel[2]);

        setSize(1000, 500);
        setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {

        Object source = e.getItemSelectable();

        for (int i = 0; i < 3; i++) {
            if (source == buttons[i]) {
                System.out.println(buttons[i].getText());
                if (e.getStateChange() == ItemEvent.DESELECTED) {
                    pictureLabel[i].setIcon(null);
                } else {
                    pictureLabel[i].setIcon(icon[i]);
                }
            }
        }
    }

    ImageIcon imageSetSize(ImageIcon icon, int width, int height) {
        Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
        Image yimg = ximg.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        // 이미지 화질 유지를 하면서 크기를 조절할 수 있는 메소드 getScaledInstance
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }

    public static void main(String[] args) {
        new CheckboxTest();
    }
}
