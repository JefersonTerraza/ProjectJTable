package org.example;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class Desktop extends JFrame {

    private JTable table = new JTable();
    private TableModel model;
    private JPanel panel = new JPanel();
    public Desktop(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,300,500);
        model = new Table();

        table = new JTable(model);
        panel.add(table);
        add(panel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
