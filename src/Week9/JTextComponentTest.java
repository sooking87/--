package Week9;

import java.awt.*;
import javax.swing.*;

public class JTextComponentTest {
    JFrame jf;
    Container c;
    JLabel jl1, jl2, jl3;
    JPanel top, center, bottom, tfPanel, pfPanel, btnPanel, taPanel;
    JTextField textfield;
    JPasswordField password;
    JTextArea textarea;

    public JTextComponentTest() {
        // 컨테이너 생성
        jf = new JFrame("TextComponent Test : SSK");
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        /* top */
        // BorderLayout.NORTH에 붙힐 패널 생성
        top = new JPanel();
        tfPanel = new JPanel();
        pfPanel = new JPanel();
        // BorderLayout.NORTH에 붙힐 textField 관련 컴포넌트 생성
        jl1 = new JLabel("JTextField", JLabel.CENTER);
        textfield = new JTextField(10);
        tfPanel.add(jl1);
        tfPanel.add(textfield);
        // BorderLayout.NORTH에 붙힐 passwordField 관련 컴포넌트 생성
        jl2 = new JLabel("JPasswordField", JLabel.CENTER);
        password = new JPasswordField(10);
        // 컴포넌트 붙히기
        pfPanel.add(jl2);
        pfPanel.add(password);
        top.add(tfPanel);
        top.add(pfPanel);

        /* center */
        // BorderLayout.CEMTER에 붙힐 패널 생성
        center = new JPanel();
        taPanel = new JPanel();
        // BorderLayout.NORTH에 붙힐 textField 관련 컴포넌트 생성
        jl3 = new JLabel("JTextArea", JLabel.CENTER);
        textarea = new JTextArea(20, 10);
        // 컴포넌트 붙히기
        taPanel.add(jl3);
        taPanel.add(textarea);
        center.add(taPanel);

        // 컨테이너에 패널 붙히기
        c.add(top, BorderLayout.NORTH);
        c.add(center, BorderLayout.CENTER);

        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}
