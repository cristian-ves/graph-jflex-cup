package org.graph.frontend;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        JPanel mainPanel = mainFrame.getMainPanel();

        JFrame frame = new JFrame("Graph JFlex & Cup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        mainFrame.getNewFile().addActionListener(actionEvent -> {
            mainFrame.showTextPane();
        });

        mainFrame.getOpenFile().addActionListener(actionEvent -> {
            mainFrame.openNewFile(frame);
        });

        mainFrame.getSaveFile().addActionListener(actionEvent -> {
            mainFrame.saveFile(frame);
        });

    }
}
