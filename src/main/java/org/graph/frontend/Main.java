package org.graph.frontend;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        UI frame = new UI("Graph JFlex & Cup");
        JPanel mainPanel = frame.getMainPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.getNewFile().addActionListener(actionEvent -> {
            frame.showTextPane();
        });

        frame.getOpenFile().addActionListener(actionEvent -> {
            frame.openNewFile(frame);
        });

        frame.getSaveFile().addActionListener(actionEvent -> {
            frame.saveFile(frame);
        });
    }
}
