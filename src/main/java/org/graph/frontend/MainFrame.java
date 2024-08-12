package org.graph.frontend;

import org.graph.backend.GraphLexer;
import org.graph.backend.GraphParser;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame{
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
    private GraphCanvas canvas;

    public MainFrame(String title){
        super(title);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JMenuItem getNewFile() {
        return newFile;
    }

    public JMenuItem getOpenFile() {
        return openFile;
    }

    public JMenuItem getSaveFile() {
        return saveFile;
    }

    public void compile() {
        String entrada = textPane.getText();

        StringReader reader = new StringReader(entrada);
        GraphLexer lexer = new GraphLexer(reader);
        GraphParser parser = new GraphParser(lexer);

        try {
            parser.parse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void showTextPane( ) {
        bodyPanel.removeAll();
        bottomPanel.removeAll();

        textPane = new JTextPane();
        textPaneScrollPane = new JScrollPane(textPane);
        bodyPanel.add(textPaneScrollPane);

        compileButton = new JButton("Compile");
        lineColPane = new JPanel(new FlowLayout());
        lineLabel = new JLabel("Line: 0");
        colLabel = new JLabel("Column: 0");
        lineColPane.add(lineLabel);
        lineColPane.add(colLabel);
        bottomPanel.add(compileButton);
        bottomPanel.add(lineColPane);

        saveFile.setEnabled(true);

        bodyPanel.revalidate();
        bodyPanel.repaint();
        bottomPanel.revalidate();
        bottomPanel.repaint();

        textPane.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                try {
                    int caretPos = textPane.getCaretPosition();
                    int line = textPane.getDocument().getDefaultRootElement().getElementIndex(caretPos) + 1;

                    int startOfLine = textPane.getDocument().getDefaultRootElement().getElement(line - 1).getStartOffset();
                    int column = caretPos - startOfLine + 1;

                    lineLabel.setText("Line: " + line);
                    colLabel.setText("Column: " + column);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        compileButton.addActionListener(actionEvent -> {
            bodyPanel.removeAll();

            canvas = new GraphCanvas();

            bodyPanel.add(canvas);
            compile();

            bodyPanel.revalidate();
            bodyPanel.repaint();
        });

    }

    public void openNewFile (JFrame frame) {
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
                    showTextPane();
                    textPane.setText("");
                    StyledDocument sd = textPane.getStyledDocument();

                    for (String str : lines) {
                        try {
                            sd.insertString(sd.getLength(), str , null);
                        } catch (BadLocationException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(frame, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else {
                JOptionPane.showMessageDialog(frame, "Please select a .txt file", "Invalid File", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public void saveFile(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save file as");

        int userSelection = fileChooser.showSaveDialog(mainPanel);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))){
                textPane.write(writer);
                JOptionPane.showMessageDialog(frame, "File saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(frame, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
