package org.graph.frontend.canvas;

import java.awt.*;

public class Pol extends Shape {

    double x, y, w, h;
    int cl;

    public Pol(String nombre, double x, double y, int cl, double w, double h, Color color) {
        super(nombre, color);
        this.x = x;
        this.y = y;
        this.cl = cl;
        this.w = w;
        this.h = h;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getCl() {
        return cl;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }
}
