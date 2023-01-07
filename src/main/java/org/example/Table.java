package org.example;

import javax.swing.table.AbstractTableModel;

public class Table extends AbstractTableModel {


    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }


}
