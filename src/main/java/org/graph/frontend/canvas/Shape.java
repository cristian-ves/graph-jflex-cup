package org.graph.frontend.canvas;

import java.awt.*;

public class Shape {

    private String nombre;
    private Color color;

    public Shape(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }
}
