package Week9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HWRadioButtonwithEvent implements ItemListener {
    JFrame jf;
    Container c;
    JLabel title, choose;
    JPanel jp;
    ButtonGroup size;
    JRadioButton small, medium, large;

    public HWRadioButtonwithEvent() {
        // 컨테이너 생성
        jf = new JFrame("Radio Button Test : SSK");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        jp = new JPanel();

        // 라벨 생성
        title = new JLabel("What size of Coffe do you like to order?");
        choose = new JLabel("Did not select the size");
        choose.setForeground(Color.RED);

        // RadioButton 생성 -> ButtonGroup에 추가
        // RadioButton 클릭 여부에 따라 이벤트 처리를 해주어야 되므로 RadioButton에 이벤트 리스너 등록
        size = new ButtonGroup();
        small = new JRadioButton("Small Size");
        small.addItemListener(this);
        medium = new JRadioButton("Medium Size");
        large = new JRadioButton("Large Size");
        size.add(small);
        size.add(medium);
        size.add(large);

        // 패널에 라디오버튼 부착
        jp.add(small);
        jp.add(medium);
        jp.add(large);

        // 컨테이너에 컴포넌트 부착
        c.add(title, BorderLayout.NORTH);
        c.add(jp, BorderLayout.CENTER);
        c.add(choose, BorderLayout.SOUTH);

        jf.setSize(400, 200);
        jf.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        new HWRadioButtonwithEventMain();
    }
}
