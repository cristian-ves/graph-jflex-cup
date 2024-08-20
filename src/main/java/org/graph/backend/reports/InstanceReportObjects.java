package org.graph.backend.reports;

public class InstanceReportObjects {
    private String name;
    private int times;

    public InstanceReportObjects(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public String getName() {
        return name;
    }
}
