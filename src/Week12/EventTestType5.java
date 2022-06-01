
package Week12;

import javax.swing.*;

public class EventTestType5 extends JFrame {
    JButton button;
    JLabel label;

    public EventTestType5(String msg) {
        super(msg);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        // 이벤트 리스너 등록
        // 5th Type :: Lambda Expression
        // 이벤트가 발생하면 바로 코드로 넘어간다.
        button.addActionListener(e -> {

            if (e.getSource() == button) {
                label.setText("Clicked the Button");
            }
        });
        panel.add(button);
        panel.add(label);

        add(panel);
        setVisible(true);
    }
}
