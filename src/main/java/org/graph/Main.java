package org.graph;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                if(file.getName().endsWith(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        List<String> lines = new ArrayList<>();
                        while ((line = reader.readLine()) != null) {
                            lines.add(line + "\n");
                        }
                        mainFrame.openNewFile(lines);
                    } catch (IOException ioException) {
                        JOptionPane.showMessageDialog(frame, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(frame, "Please select a .txt file", "Invalid File", JOptionPane.WARNING_MESSAGE);
                }
            }
            System.out.println(result + " | " + fileChooser.getApproveButtonMnemonic() + " | " + fileChooser.getSelectedFile());
        });

    }
}
