package org.graph.frontend.canvas;

import java.awt.*;

public class Sqr extends Shape{

    private double x, y, l;

    public Sqr(String nombre, double x, double y, double l, Color color) {
        super(nombre, color);
        this.x = x;
        this.y = y;
        this.l = l;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getL() {
        return l;
    }
}
