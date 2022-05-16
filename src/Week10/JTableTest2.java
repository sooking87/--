package Week10;

import java.awt.*;
import javax.swing.*;

public class JTableTest2 {
    JTable table;

    public JTableTest2(String msg) {
        // 컨테이너 생성
        JFrame jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        jf.getContentPane().add(new JScrollPane(table), "Center");
        jf.setSize(300, 200);
        jf.setVisible(true);
    }
}
