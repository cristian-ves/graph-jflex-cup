package org.graph.frontend.canvas;

import java.awt.*;

public class Circle extends Shape {

    private double radius, x, y;

    public Circle(String nombre, double x, double y, double radius, Color color) {
        super(nombre, color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
