package org.graph.frontend.ReportsUI;

import org.graph.backend.reports.InstanceReportColor;

import java.util.List;

public class ReportColorsUI extends ReportUI{

    public ReportColorsUI(List instances) {
        super(instances, "Reporte colores");
    }

    @Override
    protected void setUpColumns() {
        tableModel.addColumn("Color");
        tableModel.addColumn("Cantidad de uso");

    }

    @Override
    protected void populateTable(List instances) {
        for (InstanceReportColor instance : (List<InstanceReportColor>) instances) {
            tableModel.addRow(new Object[]{
                    instance.getColor(),
                    instance.getTimes()
            });
        }
    }
}
