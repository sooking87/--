package Week12;

import java.awt.event.*;
import javax.swing.*;

public class EventTestType3 extends JFrame {
    JButton button;
    JLabel label;

    public EventTestType3(String msg) {
        super(msg);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 이벤트 리스너 등록
        // 3rd Type :: No-name Inner Class
        // 익명 클래스(무명씨)
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    label.setText("Clicked the Button");
                }
            }
        });
        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }
}
