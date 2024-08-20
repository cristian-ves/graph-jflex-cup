package org.graph.frontend.ReportsUI;

import org.graph.backend.reports.InstanceReportObjects;

import java.util.List;

public class ReportAnimationsUI extends ReportUI{
    public ReportAnimationsUI(List instances) {
        super(instances, "Reporte animaciones");
    }

    @Override
    protected void setUpColumns() {
        tableModel.addColumn("Animacion");
        tableModel.addColumn("Cantidad de uso");

    }

    @Override
    protected void populateTable(List instances) {
        for (InstanceReportObjects instance: (List<InstanceReportObjects>)instances) {
            tableModel.addRow(new Object[]{
                    instance.getName(),
                    instance.getTimes()
            });
        }
    }
}
