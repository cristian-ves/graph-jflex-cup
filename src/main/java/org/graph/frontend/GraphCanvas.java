package org.graph.frontend;

import java.awt.*;

public class GraphCanvas extends Canvas {

    public GraphCanvas() {
        setSize(800, 430);
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.black);

        g.drawLine(50, 50, 350, 350);
    }
}
