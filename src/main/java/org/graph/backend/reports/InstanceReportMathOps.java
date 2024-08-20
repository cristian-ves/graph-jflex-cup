package org.graph.backend.reports;

public class InstanceReportMathOps {

    public static enum Operator {
        Suma,
        Resta,
        Multiplicacion,
        Division
    }

    private Operator operator;
    private int line;
    private int column;
    private String ocurrence;

    public InstanceReportMathOps(Operator operator, int line, int column, String ocurrence) {
        this.operator = operator;
        this.line = line;
        this.column = column;
        this.ocurrence = ocurrence;
    }

    public Operator getOperator() {
        return operator;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getOcurrence() {
        return ocurrence;
    }
}
