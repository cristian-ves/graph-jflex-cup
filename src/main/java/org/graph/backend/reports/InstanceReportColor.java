package org.graph.backend.reports;

import java.awt.*;

public class InstanceReportColor {
    private String color;
    private int times;

    public InstanceReportColor(String color, int times) {
        this.color = color;
        this.times = times;
    }

    public String getColor() {
        return color;
    }

    public int getTimes() {
        return times;
    }
}
