package Week10;

import java.awt.*;
import javax.swing.*;

public class InnerFrameTest3 {
    JDesktopPane desktop;
    JInternalFrame inframe1, inframe2;
    JButton ok;

    public InnerFrameTest3(String msg) {
        JFrame jf = new JFrame(msg);
        desktop = new JDesktopPane();
        inframe1 = new JInternalFrame("Inner Frame 1", true, true, false, false);

        ok = new JButton("OK");
        inframe1.getContentPane().add(ok, BorderLayout.SOUTH);

        inframe1.setSize(200, 200);
        inframe1.setVisible(true);
        ;

        inframe2 = new JInternalFrame("Inner Frame 2", true, true, false, false);
        JPanel jp = new JPanel();
        ImageIcon logo = new ImageIcon("C:\\STUDY\\3학기\\전공\\객체\\src\\Images\\dog.png");
        JButton icon = new JButton(logo);
        jp.add(icon);

        inframe2.getContentPane().add(jp, BorderLayout.SOUTH);
        inframe2.setSize(500, 500);
        inframe2.setVisible(true);

        desktop.add(inframe1);
        desktop.add(inframe2);
        jf.getContentPane().add(desktop, BorderLayout.CENTER);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(700, 700);
        jf.setVisible(true);
    }
}
