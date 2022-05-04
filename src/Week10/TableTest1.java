package Week10;

import java.awt.*;
import javax.swing.*;

public class TableTest1 {
    public TableTest1(String msg) {
        JFrame jf = new JFrame(msg);
        // Table column 설정
        String columnName[] = { "Name", "Phone", "E-mail" };

        // Table data 설정
        String data[][] = {
                { "SohnSooKyoung", "010-3809-7668", "sksohn01@sm.ac.kr" }, // row1
                { "SohnSooKyoung", "031-274-7668", "sksohn01@naver.com" } // row2
        };

        // Table 생성
        JTable table = new JTable(data, columnName);

        // Table이 많은 경우 ScrollPane 사용
        JScrollPane sp = new JScrollPane(table);

        // Table 붙히기
        jf.getContentPane().add(sp);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}
