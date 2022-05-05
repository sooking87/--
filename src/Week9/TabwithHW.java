package Week9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TabwithHW implements ActionListener, ItemListener {
    JFrame jf;
    JTabbedPane tp;

    // hw1
    JLabel tab1l;
    JButton tab1jb;

    // hw2
    JLabel choose;
    JRadioButton small;
    JRadioButton medium;
    JRadioButton large;

    public TabwithHW() {
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tp = new JTabbedPane();

        // Panel creation according to the size of the tab
        // The number of tabs, a panel is created for each tab.
        JPanel hw1 = new JPanel();
        JPanel hw2 = new JPanel();
        hw2.setLayout(new BorderLayout());
        JPanel hw3 = new JPanel();
        hw3.setLayout(new BorderLayout());

        // Tabbing a JTabbedPane
        tp.addTab("HW1", hw1);
        tp.addTab("HW2", hw2);
        tp.addTab("HW3", hw3);

        /* HW1 */
        // Create a Label and Button and add them to the panel
        tab1l = new JLabel("Click JButton to see Image");
        tab1jb = new JButton("See Image!!");

        // Register Event Listener for JButton: Prepare to receive event for click
        tab1jb.addActionListener(this);
        hw1.add(tab1l);
        hw1.add(tab1jb);

        /* HW2 */
        // Create Panel and Label
        JPanel buttons = new JPanel();
        JLabel title = new JLabel("What size of Coffee do you like to order?", JLabel.CENTER);
        choose = new JLabel("Did not select the size", JLabel.CENTER);
        choose.setForeground(Color.RED);

        // Create RadioButton ->Add to ButtonGroup
        ButtonGroup size = new ButtonGroup();
        small = new JRadioButton("Small Size");
        medium = new JRadioButton("Medium Size");
        large = new JRadioButton("Large Size");
        size.add(small);
        size.add(medium);
        size.add(large);

        /*
         * Register an event listener on the RadioButton
         * because you need to handle an event depending on whether the RadioButton is
         * clicked or not.
         */
        small.addItemListener(this);
        medium.addItemListener(this);
        large.addItemListener(this);

        // Attach radio button to panel
        buttons.add(small);
        buttons.add(medium);
        buttons.add(large);

        // Attaching components to the panel
        hw2.add(title, BorderLayout.NORTH);
        hw2.add(buttons, BorderLayout.CENTER);
        hw2.add(choose, BorderLayout.SOUTH);

        /* HW3 */
        // Create label
        JLabel login = new JLabel("Login");
        JLabel password = new JLabel("Password");
        JLabel press = new JLabel("Press");

        // Create input window component
        JTextField inputLogin = new JTextField(20);
        JPasswordField inputPassword = new JPasswordField(20);
        JTextArea inputOpinion = new JTextArea("Enter for Your Opinion", 13, 10);

        // Create button
        JButton btnOK = new JButton("OK");

        // Create a panel
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(2, 2));
        JPanel center = new JPanel();
        JPanel bottom = new JPanel();

        // top Pnel -> loginPanel + passwordPanel
        top.add(login);
        top.add(inputLogin);
        top.add(password);
        top.add(inputPassword);

        // center Panel
        center.add(inputOpinion);

        // bottom Panel
        bottom.add(press);
        bottom.add(btnOK);

        // Add to Container
        hw3.add(top, BorderLayout.NORTH);
        hw3.add(center, BorderLayout.CENTER);
        hw3.add(bottom, BorderLayout.SOUTH);

        jf.add(tp);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source.getText().equals("Good Luck")) {
            tab1l.setIcon(null);
            tab1l.setText("Click JButton to see Image");
            tab1jb.setText("See Image!!");
        } else {
            ImageIcon dog = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog.png");
            tab1l.setIcon(dog);
            tab1l.setText("Dog Joji");
            tab1jb.setText("Good Luck");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton clicked = (JRadioButton) e.getItemSelectable();

        // When an item is selected, only the selected item can be handled.
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (clicked == small || clicked == medium || clicked == large) {
                choose.setText("Ordered " + clicked.getText() + ".");
            }
        }
    }
}
