package org.graph.backend.export;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.graph.frontend.canvas.GraphCanvas;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public  class GraphExporter {

    public static void exportCanvasToPNG(GraphCanvas canvas, String filePath) {
        BufferedImage image = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0,canvas.getWidth(),canvas.getHeight());

        canvas.paint(g2d);
        g2d.dispose();

        try {
            ImageIO.write(image, "PNG", new File(filePath));
            JOptionPane.showMessageDialog(null, "PNG guardado correctamente!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportCanvasToPDF(GraphCanvas canvas, String filePath) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(new PDRectangle(canvas.getWidth(), canvas.getHeight()));
            document.addPage(page);

            BufferedImage image = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            canvas.paint(g2d);
            g2d.dispose();

            File tempFile = File.createTempFile("tempCanvasImage", ".png");
            ImageIO.write(image, "PNG", tempFile);

            PDImageXObject pdImage = PDImageXObject.createFromFile(tempFile.getAbsolutePath(), document);
            try (PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.OVERWRITE, true)) {
                contentStream.drawImage(pdImage, 0, 0, canvas.getWidth(), canvas.getHeight());
            }

            document.save(filePath);
            JOptionPane.showMessageDialog(null, "PDF guardado correctamente!");

            // Delete the temporary file
            tempFile.delete();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to save the PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
