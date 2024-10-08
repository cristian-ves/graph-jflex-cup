package org.graph.frontend;

import org.graph.backend.GraphLexer;
import org.graph.backend.GraphParser;
import org.graph.backend.export.GraphExporter;
import org.graph.backend.reports.InstanceReportColor;
import org.graph.backend.reports.InstanceReportMathOps;
import org.graph.backend.reports.InstanceReportObjects;
import org.graph.frontend.ReportsUI.ReportAnimationsUI;
import org.graph.frontend.ReportsUI.ReportColorsUI;
import org.graph.frontend.ReportsUI.ReportMathOpsUI;
import org.graph.frontend.ReportsUI.ReportObjectsUI;
import org.graph.frontend.canvas.GraphCanvas;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UI extends JFrame{
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
    private JButton animateButton;
    private JComboBox exportComboBox;
    private JButton exportButton;

    private List<InstanceReportMathOps> instancesMathOps;
    private List<InstanceReportColor> instancesColors;
    private List<InstanceReportObjects> instancesObjects;
    private List<InstanceReportObjects> instancesAnimations;

    public UI(String title){
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

    public JButton getAnimateButton() {
        return animateButton;
    }

    public JButton getExportButton() {
        return exportButton;
    }

    public void exportCanvas () {

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Exportar grafico");
        
        int selectionCombo = exportComboBox.getSelectedIndex();
        
        if (selectionCombo == -1) {
            JOptionPane.showMessageDialog(mainPanel, "Debe seleccionar una opcion.");
        } else if (selectionCombo == 1) {
            chooser.setFileFilter(new FileNameExtensionFilter("PNG Images", "png"));
            int selection = chooser.showSaveDialog(this);
    
            if (selection == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                String filePath = file.getAbsolutePath();
    
                if(!filePath.endsWith(".png")){
                    filePath += ".png";
                }
    
                GraphExporter.exportCanvasToPNG(canvas, filePath);
            }
        } else if (selectionCombo == 0) {

            chooser.setFileFilter(new FileNameExtensionFilter("PDF Document", "pdf"));

            int selection = chooser.showOpenDialog(this);

            if (selection == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                String filePath = file.getAbsolutePath();

                if(!filePath.endsWith(".pdf")){
                    filePath += ".pdf";
                }

                GraphExporter.exportCanvasToPDF(canvas, filePath);
            }
        }


    }

    public void compile(GraphCanvas canvas) {
        String entrada = textPane.getText();

        StringReader reader = new StringReader(entrada);
        GraphLexer lexer = new GraphLexer(reader);
        GraphParser parser = new GraphParser(lexer, canvas);

        try {
            parser.parse();
            mathOpsReport.setEnabled(true);
            colorsReport.setEnabled(true);
            objectsReport.setEnabled(true);
            animationsReport.setEnabled(true);
            errorsReport.setEnabled(true);

            mathOpsReport.addActionListener(actionEvent -> {
                showMathOpsReport(lexer);
            });

            colorsReport.addActionListener(actionEvent -> {
                showColorsReport(lexer);
            });

            objectsReport.addActionListener(actionEvent -> {
                showObjectsReport(lexer);
            });

            animationsReport.addActionListener(actionEvent -> {
               showAnimationsReport(lexer);
            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void showAnimationsReport(GraphLexer lexer) {
        instancesAnimations = new ArrayList<>();
        instancesAnimations.add(new InstanceReportObjects("Linea", lexer.getTimesLineaAnmt()));
        instancesAnimations.add(new InstanceReportObjects("Curva", lexer.getTimesCurva()));
        new ReportAnimationsUI(instancesAnimations);
    }

    public void showObjectsReport (GraphLexer lexer) {
        instancesObjects = new ArrayList<>();
        instancesObjects.add(new InstanceReportObjects("Linea", lexer.getTimesLinea()));
        instancesObjects.add(new InstanceReportObjects("Circulo", lexer.getTimesCirculo()));
        instancesObjects.add(new InstanceReportObjects("Cuadrado", lexer.getTimesCuadrado()));
        instancesObjects.add(new InstanceReportObjects("Rectangulo", lexer.getTimesRectangulo()));
        instancesObjects.add(new InstanceReportObjects("Poligono", lexer.getTimesPoligono()));
        new ReportObjectsUI(instancesObjects);
    }

    public void showColorsReport (GraphLexer lexer) {

        instancesColors = new ArrayList<>();
        instancesColors.add(new InstanceReportColor("Azul", lexer.getTimesBlue()));
        instancesColors.add(new InstanceReportColor("Rojo", lexer.getTimesRojo()));
        instancesColors.add(new InstanceReportColor("Amarillo", lexer.getTimesAmarillo()));
        instancesColors.add(new InstanceReportColor("Verde", lexer.getTimesVerde()));
        instancesColors.add(new InstanceReportColor("Celeste", lexer.getTimesCeleste()));
        instancesColors.add(new InstanceReportColor("Negro", lexer.getTimesNegro()));
        instancesColors.add(new InstanceReportColor("Rosado", lexer.getTimesRosado()));
        instancesColors.add(new InstanceReportColor("Cafe", lexer.getTimesCafe()));
        instancesColors.add(new InstanceReportColor("Naranja", lexer.getTimesNaranja()));
        new ReportColorsUI(instancesColors);
    }

    public void showMathOpsReport (GraphLexer lexer) {

        instancesMathOps = lexer.getMathOps();
        new ReportMathOpsUI(instancesMathOps);

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
            bottomPanel.removeAll();

            canvas = new GraphCanvas();
            canvas.setBounds(10, 10, canvas.getWidth(), canvas.getHeight());

            bodyPanel.add(canvas, BorderLayout.CENTER);

            animateButton = new JButton("Animate");
            exportButton = new JButton("Export");
            exportComboBox = new JComboBox(new String[]{"PDF", "PNG"});

            bottomPanel.add(animateButton);
            bottomPanel.add(exportButton);
            bottomPanel.add(exportComboBox);
            bottomPanel.revalidate();
            bottomPanel.repaint();

            compile(canvas);

            bodyPanel.revalidate();
            bodyPanel.repaint();

            exportButton.addActionListener(actionEvent1 -> {
                exportCanvas();
            });

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
