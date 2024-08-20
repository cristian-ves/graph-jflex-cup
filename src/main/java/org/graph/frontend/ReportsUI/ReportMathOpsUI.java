package org.graph.frontend.ReportsUI;

import org.graph.backend.reports.InstanceReportMathOps;

import java.util.List;

public class ReportMathOpsUI extends ReportUI {

    List<InstanceReportMathOps> instances;

    public ReportMathOpsUI(List<InstanceReportMathOps> instances) {
        super(instances, "Reporte operaciones aritmeticas");
    }

    @Override
    protected void setUpColumns() {
        tableModel.addColumn("Operador");
        tableModel.addColumn("Linea");
        tableModel.addColumn("Columna");
        tableModel.addColumn("Ocurrencia");
    }

    @Override
    protected void populateTable(List instances) {
        for (InstanceReportMathOps instance : (List<InstanceReportMathOps>) instances) {
            tableModel.addRow(new Object[]{
                    instance.getOperator(),
                    instance.getLine(),
                    instance.getColumn(),
                    instance.getOcurrence()
            });
        }
    }
}
