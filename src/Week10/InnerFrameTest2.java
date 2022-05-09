package Week10;

import javax.swing.*;

public class InnerFrameTest2 {
    JFrame jf;
    JDesktopPane desktop; // Inner Frame을 붙히기 위한 상위 Panel
    JInternalFrame inframe1, inframe2;
    JButton ok;

    public InnerFrameTest2(String msg) {
        jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        desktop = new JDesktopPane();
        inframe1 = new JInternalFrame("Inner Frame 1");
        inframe2 = new JInternalFrame("Inner Frame 2");

        // Inner Frame setting * 꼭 필요!
        inframe1.setSize(200, 200);
        inframe1.setVisible(true);
        inframe2.setSize(400, 400);
        inframe2.setVisible(true);

        // Inner Frame 붙히기
        desktop.add(inframe1);
        desktop.add(inframe2);

        // JFrame setting
        jf.getContentPane().add(desktop); // -> 이것만 하면(JDesktopPane 없이) 프레임이 안들어가짐 패널을 붙히기 위해서는 하나를 더 선언해주어야 됨 ->
                                          // JDesktopPane
        jf.setSize(600, 600);
        jf.setVisible(true);

    }
}
