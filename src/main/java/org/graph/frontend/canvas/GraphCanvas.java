package org.graph.frontend.canvas;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GraphCanvas extends Canvas {

    private List<Line> lines = new ArrayList<>();
    private List<Circle> circles = new ArrayList<>();
    private List<Sqr> sqrs = new ArrayList<>();
    private List<Rec> recs = new ArrayList<>();
    private List<Pol> pols = new ArrayList<>();

    public GraphCanvas() {
        setSize(800, 430);
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Draw all lines
        for (Line line : lines) {
            g.setColor(line.getColor());
            g.drawLine((int) line.getX1(), (int) line.getY1(), (int) line.getX2(), (int) line.getY2());
            g.drawString(line.getNombre(), (int) ((line.getX1() + line.getX2()) / 2), (int) line.getY1() - 5);
        }

        // Draw circles
        for (Circle circle : circles) {
            g.setColor(circle.getColor());
            g.drawOval((int) circle.getX(), (int) circle.getY(), (int) circle.getRadius(), (int) circle.getRadius());
            g.drawString(circle.getNombre(), (int) circle.getX(), (int) circle.getY() - 5);
        }

        // Draw squares
        for (Sqr sqr : sqrs) {
            g.setColor(sqr.getColor());
            g.drawRect((int) sqr.getX(), (int) sqr.getY(), (int) sqr.getL(), (int) sqr.getL());
            g.drawString(sqr.getNombre(), (int) sqr.getX(), (int) sqr.getY() - 5);
        }

        // Draw recs
        for (Rec rec : recs) {
            g.setColor(rec.getColor());
            g.drawRect((int) rec.getX(), (int) rec.getY(), (int) rec.getL1(), (int) rec.getL2());
            g.drawString(rec.getNombre(), (int) rec.getX(), (int) rec.getY() - 5);
        }

        // Draw pols
        for (Pol pol : pols) {
            graphPol(pol, g);
            g.drawString(pol.getNombre(), (int) pol.getX(), (int) pol.getY() - 5);
        }

    }

    public void addLine(String nombre, double x1, double y1, double x2, double y2, Color color) {
        Line line = new Line(nombre, x1, y1, x2, y2, color);
        lines.add(line);
        repaint();
    }

    public void addCircle(String nombre, double x, double y, double r, Color color) {
        Circle circle = new Circle(nombre, x, y, r, color);
        circles.add(circle);
        repaint();
    }

    public void addSqr(String nombre, double x, double y, double r, Color color) {
        Sqr sqr = new Sqr(nombre, x, y, r, color);
        sqrs.add(sqr);
        repaint();
    }

    public void addRec(String nombre, double x, double y, double l1, double l2, Color color) {
        Rec rec = new Rec(nombre, x, y, l1, l2, color);
        recs.add(rec);
        repaint();
    }

    public void addPol(String nombre, double x, double y, int cl, double w, double h, Color color) {

        Pol pol = new Pol(nombre, x, y, cl, w, h, color);
        pols.add(pol);
        repaint();

    }

    public void graphPol(Pol pol, Graphics g) {
        int[] xPoints = new int[pol.getCl()];
        int[] yPoints = new int[pol.getCl()];

        double angle = 2 * Math.PI / pol.getCl();

        for (int i = 0; i < pol.getCl(); i++) {
            xPoints[i] = (int) pol.getX() + (int) (pol.getW() / 2 * Math.cos(i * angle));
            yPoints[i] = (int) pol.getY() + (int) (pol.getH() / 2 * Math.sin(i * angle));
        }

        g.setColor(pol.getColor());
        g.drawPolygon(xPoints, yPoints, pol.getCl());
    }

}
