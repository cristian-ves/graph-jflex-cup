package org.graph.frontend.ReportsUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public abstract class ReportUI <T> extends JFrame {

    protected JTable table;
    protected DefaultTableModel tableModel;

    public ReportUI(List<T> instances, String title) {

        setTitle(title);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel();
        setUpColumns();

        populateTable(instances);

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);

    }

    protected abstract void setUpColumns();

    protected abstract void populateTable(List<T> instances);



}
