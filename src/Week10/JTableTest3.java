package Week10;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class JTableTest3 {
    JFrame jf;
    JTable table;
    TableModel model;

    public JTableTest3(String msg) {
        // 컨테이너 생성
        jf = new JFrame(msg);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model = new TableModel();
        // table = new JTable(model);

        // 테이블 수정을 위한 메소드 호출
        setUpDeptColumn(table.getColumnModel().getColumn(2));
        jf.getContentPane().add(new JScrollPane(table), "Center");
        jf.setSize(300, 200);
        jf.setVisible(true);
    }

    public void setUpDeptColumn(TableColumn deptColumn) {
        JComboBox comboBox = new JComboBox();
        comboBox.addItem(new String("Dev."));
        comboBox.addItem(new String("Research"));
        comboBox.addItem(new String("Finance"));
        deptColumn.setCellEditor(new DefaultCellEditor(comboBox));

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo Box");
        deptColumn.setCellRenderer(renderer);

        TableCellRenderer headerRenderer = deptColumn.getHeaderRenderer();
        if (headerRenderer instanceof DefaultTableCellRenderer) {
            ((DefaultTableCellRenderer) headerRenderer).setToolTipText("Click");
        }
    }
}
