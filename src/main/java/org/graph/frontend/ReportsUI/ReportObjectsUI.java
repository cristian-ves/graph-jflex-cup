package org.graph.frontend.ReportsUI;

import org.graph.backend.reports.InstanceReportObjects;

import java.util.List;

public class ReportObjectsUI extends ReportUI{
    public ReportObjectsUI(List instances) {
        super(instances, "Reporte objetos usados");
    }

    @Override
    protected void setUpColumns() {
        tableModel.addColumn("Objeto");
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
