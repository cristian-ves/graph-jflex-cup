package org.graph.frontend.canvas;

import java.awt.*;

public class Rec extends Shape {

    double x, y, l1, l2;

    public Rec(String nombre, double x, double y, double l1, double l2, Color color) {
        super(nombre, color);
        this.x = x;
        this.y = y;
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }
}
