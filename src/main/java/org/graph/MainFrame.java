package org.graph;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame {
    private JPanel mainPanel;
    private JMenu file;
    private JMenuItem newFile;
    private JMenuItem saveFile;
    private JMenuItem openFile;
    private JMenu report;
    private JMenuItem mathOpsReport;
    private JMenuItem colorsReport;
    private JMenuItem objectsReport;
    private JMenuItem animationsReport;
    private JMenuItem errorsReport;
    private JPanel bodyPanel;
    private JPanel bottomPanel;
    private JMenuBar topMenu;
    private JScrollPane textPaneScrollPane;
    private JTextPane textPane;
    private JButton compileButton;
    private JPanel lineColPane;
    private JLabel lineLabel;
    private JLabel colLabel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JMenuItem getNewFile() {
        return newFile;
    }

    public JMenuItem getOpenFile() {
        return openFile;
    }

    public void showTextPane( ) {
        bodyPanel.removeAll();
        bottomPanel.removeAll();

        textPane = new JTextPane();
        textPaneScrollPane = new JScrollPane(textPane);
        bodyPanel.add(textPaneScrollPane);

        compileButton = new JButton("Compile");
        lineColPane = new JPanel(new FlowLayout());
        lineLabel = new JLabel("Line: ");
        colLabel = new JLabel("Column: ");
        lineColPane.add(lineLabel);
        lineColPane.add(colLabel);
        bottomPanel.add(compileButton);
        bottomPanel.add(lineColPane);

        saveFile.setEnabled(true);

        bodyPanel.revalidate();
        bodyPanel.repaint();
        bottomPanel.revalidate();
        bottomPanel.repaint();

    }

    public void openNewFile (List<String> lines) {
        showTextPane();
        textPane.setText("");
        StyledDocument sd = textPane.getStyledDocument();

        for (String str : lines) {
            try {
                sd.insertString(sd.getLength(), str + "\n", null);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
    }
}
