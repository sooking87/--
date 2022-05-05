package Week9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HWLoginUI {
    JFrame jf;
    Container c;
    JLabel login, password, press;
    JPanel top, center, bottom;
    JTextField inputLogin;
    JPasswordField inputPassword;
    JTextArea inputOpinion;
    JButton btnOK;

    public HWLoginUI() {
        // Create container
        jf = new JFrame("LoginUI : SSK");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        // Create label
        login = new JLabel("Login");
        password = new JLabel("Password");
        press = new JLabel("Press");

        // Create input window component
        inputLogin = new JTextField(20);
        inputPassword = new JPasswordField(20);
        inputOpinion = new JTextArea("Enter for Your Opinion", 13, 10);

        // Create button
        btnOK = new JButton("OK");

        // Create a panel
        top = new JPanel();
        top.setLayout(new GridLayout(2, 2));
        center = new JPanel();
        bottom = new JPanel();

        // top panel -> loginPanel + passwordPanel
        top.add(login);
        top.add(inputLogin);
        top.add(password);
        top.add(inputPassword);

        // center Panel
        center.add(inputOpinion);

        // bottom Panel
        bottom.add(press);
        bottom.add(btnOK);

        // attached to container
        c.add(top, BorderLayout.NORTH);
        c.add(center, BorderLayout.CENTER);
        c.add(bottom, BorderLayout.SOUTH);

        jf.setSize(400, 500);
        jf.setVisible(true);
    }
}
