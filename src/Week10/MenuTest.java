package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuTest implements ActionListener {
    JMenuBar bar;
    JMenu file, style; // MenuBar 밑에 메뉴들
    JMenuItem fileNew;
    JCheckBoxMenuItem lineNum;
    JRadioButtonMenuItem windows, linux; // style 하위 버튼
    JFrame jf;

    public MenuTest(String msg) {
        jf = new JFrame(msg);
        makeMenu();

        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    void makeMenu() {
        bar = new JMenuBar();
        file = new JMenu("File");
        // file.setMnemonic('F');
        style = new JMenu("Style");
        fileNew = new JMenuItem("New");
        lineNum = new JCheckBoxMenuItem("Line Number");

        // style 하위 아이템
        windows = new JRadioButtonMenuItem("Windows Style", true);
        linux = new JRadioButtonMenuItem("Linux Style");

        // Event Listener 등록
        file.addActionListener(this);
        style.addActionListener(this);
        fileNew.addActionListener(this);
        lineNum.addActionListener(this);
        windows.addActionListener(this);
        linux.addActionListener(this);

        // style 위한 구성
        ButtonGroup bg = new ButtonGroup();
        bg.add(windows);
        bg.add(linux);
        style.add(windows);
        style.add(linux);

        // 메뉴를 위한 구성
        // file 메뉴 안에 fileNew, lineNum, style이 들어간다.
        file.add(fileNew);
        file.addSeparator();
        file.add(lineNum);
        file.add(style);

        bar.add(file);
        jf.setJMenuBar(bar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == file) {
            System.out.println("File");
        } else if (o == style) {
            System.out.println("Style");
        } else if (o == fileNew) {
            System.out.println("New");
        } else if (o == lineNum) {
            if (lineNum.isSelected())
                System.out.println("Line Number");
        } else if (o == windows) {
            System.out.println("Windows");
        } else if (o == linux) {
            System.out.println("Linux");
        }

    }
}
