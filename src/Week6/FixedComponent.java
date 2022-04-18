package Week6;

import java.awt.*;

public class FixedComponent {
    Frame f;
    Panel top, mid, bottom;
    Label llg, lpw; // UI 관련 변수 선언
    TextField login, passwd;
    Button press, ok;

    public FixedComponent(String msg) {
        Frame f = new Frame(msg);
        f.setLayout(new BorderLayout());

        // UI 관련 Component의 객체 생성
        llg = new Label("Login");
        lpw = new Label("Password");
        login = new TextField(50);
        passwd = new TextField(50);
        passwd.setEchoChar('*');
        press = new Button("Press");
        ok = new Button("OK");

        top = new Panel();
        mid = new Panel();
        bottom = new Panel();

        top.add(llg);
        top.add(login);

        mid.add(lpw);
        mid.add(passwd);

        bottom.add(press);
        bottom.add(ok);

        // 생성된 Component 객체의 배치
        f.add(top, BorderLayout.NORTH);
        f.add(mid, BorderLayout.CENTER);
        f.add(bottom, BorderLayout.SOUTH);

        f.setSize(500, 430);
        f.setVisible(true);
    }
}
