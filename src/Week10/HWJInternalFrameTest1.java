package Week10;

import java.awt.*;
import javax.swing.*;

public class HWJInternalFrameTest1 {
    JDesktopPane desktop;
    JInternalFrame inframe;
    JPanel jp;
    JButton ok;

    public HWJInternalFrameTest1(String msg) {
        JFrame jf = new JFrame(msg);
        jf.setLayout(new GridLayout(1, 1));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // maxmizable을 통해서 윈도우 크기에 딱 맞게 inframe을 출력할 수 있습니다.
        desktop = new JDesktopPane();
        inframe = new JInternalFrame("Full Inner Frame", true, true, true, true);

        // 버튼을 inframe에 붙히기
        ok = new JButton("OK");
        inframe.getContentPane().add(ok, BorderLayout.SOUTH);

        // 화면에 보여지게 하기
        inframe.setSize(1000, 800);
        inframe.setVisible(true);

        // inframe을 desktop에 붙히기
        desktop.add(inframe);
        jf.getContentPane().add(desktop);

        jf.setSize(1000, 800);
        jf.setVisible(true);
    }
}
