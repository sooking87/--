package Week10;

import java.awt.*;
import javax.swing.*;

public class InnerFrameTest1 {
    JDesktopPane desktop;
    JInternalFrame inframe;
    JButton ok;

    public InnerFrameTest1(String msg) {
        // 컨테이너 생성
        JFrame jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inner Frame을 붙히기 위한 상위 Panel
        // 자식 창(iframe)과 결합하기 위해 작성
        desktop = new JDesktopPane();

        // 자식 창
        inframe = new JInternalFrame("Inner Frame1", true, true, false, false);

        // 버튼 컴포넌트
        ok = new JButton("OK");
        inframe.getContentPane().add(ok, BorderLayout.SOUTH);

        inframe.setSize(200, 100);
        inframe.setVisible(true);

        // iframe을 결합
        desktop.add(inframe);
        // JFrame에 desktop을 결합
        jf.getContentPane().add(desktop, BorderLayout.CENTER);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }
}
