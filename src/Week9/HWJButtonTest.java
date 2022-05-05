package Week9;

import java.awt.event.*; //For Event
import java.awt.*;
import javax.swing.*; //For Swing

public class HWJButtonTest implements ActionListener {
    JFrame jf;
    Container c;
    JPanel jp;
    JLabel jl;
    JButton jb;

    public HWJButtonTest(String msg) {
        // Create Frame
        jf = new JFrame(msg);
        jf.setTitle("JButton Event : SSK");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();

        // Create a Label and Button and add them to the panel
        jl = new JLabel("Click JButton to see Image");
        jb = new JButton("See Image!!");

        // Register Event Listener for JButton: Prepare to receive event for click
        jb.addActionListener(this);
        jp = new JPanel();
        jp.add(jl);
        jp.add(jb);
        c.add(jp);

        // Attach Panel to JFrame
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    // Implement the method defined in ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();
        // when clicked Good Luck button it should go back
        if (source.getText().equals("Good Luck")) {
            jl.setIcon(null);
            jl.setText("Click JButton to see Image");
            jb.setText("See Image!!");
        } else {
            ImageIcon dog = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog.png");
            jl.setIcon(dog);
            jl.setText("Dog Joji");
            jb.setText("Good Luck");
        }
    }
}