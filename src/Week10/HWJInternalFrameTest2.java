package Week10;

import java.awt.*;
import javax.swing.*;

public class HWJInternalFrameTest2 {
    JInternalFrame inframe1, inframe2, inframe3, inframe4;
    JDesktopPane desktop;
    JButton one; // inframe1에 붙힐 컴포넌트
    JList fruits; // inframe2에 붙힐 컴포넌트
    /* inframe3에 붙힐 컴포넌트들 */
    JMenuBar bar;
    JMenu file, style; // MenuBar 밑에 메뉴들
    JMenuItem fileNew;
    JCheckBoxMenuItem lineNum;
    JRadioButtonMenuItem windows, linux; // style 하위 버튼
    /* ---------- */
    JTable table; // inframe4에 붙힐 컴포넌트

    public HWJInternalFrameTest2(String msg) {
        // 컨테이너 생성
        JFrame jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // desktop, inframeN 객체 생성
        desktop = new JDesktopPane();
        desktop.setLayout(new GridLayout(2, 2));

        inframe1 = new JInternalFrame("JButton", true, true, true, true);
        inframe2 = new JInternalFrame("JList", true, true, true, true);
        inframe3 = new JInternalFrame("JMenu", true, true, true, true);
        inframe4 = new JInternalFrame("JTable", true, true, true, true);

        // 버튼 객체 생성
        one = new JButton("ONE");

        // inframe1에 버튼 붙히기
        inframe1.getContentPane().add(one, BorderLayout.SOUTH);

        // 프레임에 JList 붙히기
        String items[] = { "apple", "grape", "melon", "orange", "banana", "pear" };
        fruits = new JList(items);
        fruits.setVisibleRowCount(items.length);
        fruits.setVisibleRowCount(4);
        JScrollPane sp = new JScrollPane(fruits);
        inframe2.getContentPane().add(sp);

        // 프레임에 JMenu 붙히기
        makeMenu();

        // 프레임에 JTable 붙히기
        // String과 Integer가 같이 있는 data 배열 만들기
        Object[][] data = {
                { "Sohn", new Integer(22), "sksohn01@sookmyung.ac.kr" },
                { "Choi", new Integer(21), "min02choi@sookmyung.ac.kr" },
                { "Song", new Integer(22), "songsong53@naver.com" },
                { "Ann", new Integer(21), "ann212@naver.com" }
        };
        // 첫 번째 행에 들어갈 항목의 배열
        String[] columnName = { "Name", "Age", "E-mail" };

        table = new JTable(data, columnName); // (셀에 들어갈 데이터, 행 이름)
        inframe4.getContentPane().add(new JScrollPane(table), "Center");

        // 프레임이 윈도우에 보이도록 설정하기
        inframe1.setSize(300, 300);
        inframe1.setVisible(true);
        inframe2.setSize(300, 300);
        inframe2.setVisible(true);
        inframe3.setSize(300, 300);
        inframe3.setVisible(true);
        inframe4.setSize(300, 300);
        inframe4.setVisible(true);

        // desktop에 프레임 붙히기
        desktop.add(inframe1);
        desktop.add(inframe2);
        desktop.add(inframe3);
        desktop.add(inframe4);

        jf.add(desktop);
        jf.setSize(1000, 1000);
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
        inframe3.setJMenuBar(bar);
    }
}
