package Week6;

import java.awt.*;

public class FixedComponent3 {
    Frame f;
    Label llg, lpw, lnote; // UI 관련 변수 선언
    TextField login, passwd;
    TextArea note;
    Panel top, mid, bottom;

    public FixedComponent3(String msg) {
        Frame f = new Frame(msg);
        f.setLayout(null);
        top = new Panel();
        mid = new Panel();
        bottom = new Panel();
        // UI 관련 Component의 객체 생성
        llg = new Label("Login");
        lpw = new Label("Password");
        lnote = new Label("주석");
        login = new TextField(50);
        passwd = new TextField(50);
        passwd.setEchoChar('*');
        note = new TextArea("주석을 다세요", 20, 50);

        top.add(llg);
        top.add(login);

        mid.add(lpw);
        mid.add(passwd);

        bottom.add(lnote);
        bottom.add(note);

        top.setBounds(300, 50, 100, 100);
        mid.setBounds(300, 50, 100, 150);
        bottom.setBounds(300, 200, 100, 300);
        // 생성된 Component 객체의 배치
        f.add(top);
        f.add(mid);
        f.add(bottom);

        f.setSize(500, 400);
        f.setVisible(true);
    }

}
