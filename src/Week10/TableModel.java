package Week10;

import javax.swing.*;
import java.awt.*;

public class TableModel {
    // Column 정의
    String columnName[] = { "Name", "Age", "Dept", "isGood" };
    Object[][] data = {
            { "Sohn", new Integer(22), "IT", new Boolean(true) },
            { "Soo", new Integer(20), "IT", new Boolean(true) },
            { "Choi", new Integer(21), "IT", new Boolean(false) }
    };

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public int getColumnCount() {
        return columnName.length;
    }

    public int getRowCount() {
        return data.length;
    }

}
