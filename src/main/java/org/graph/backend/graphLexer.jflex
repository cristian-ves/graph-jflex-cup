// Declarations
package org.graph.backend;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;

import org.graph.backend.reports.*;

// Translation rules
%%
%class GraphLexer
%unicode
%line
%column
%public
%cup
%ignorecase

%init{
    yyline = 1;
    yychar = 1;
%init}

%{
    private List<InstanceReportMathOps> instancesMathOps = new ArrayList<>();
    private Symbol prevToken = null;
    private Symbol penToken = null;
    private Symbol curToken = null;

    public List<InstanceReportMathOps> getMathOps() {
        return instancesMathOps;
    }

    public void addMathOps(InstanceReportMathOps mathOp) {
        instancesMathOps.add(mathOp);
    }

    private void handleMathOp(String operator) {
        if(operator == null) { // implicit
            String ocurrence = prevToken.value + "*" + curToken.value;
            addMathOps(new InstanceReportMathOps(InstanceReportMathOps.Operator.Multiplicacion, yyline, yycolumn, ocurrence));
        } else {
            InstanceReportMathOps.Operator op;
            switch (operator) {
                case "-":
                    op = InstanceReportMathOps.Operator.Resta;
                    break;
                case "/":
                    op = InstanceReportMathOps.Operator.Division;
                    break;
                case "*":
                    op = InstanceReportMathOps.Operator.Multiplicacion;
                    break;
                default:
                    op = InstanceReportMathOps.Operator.Suma;
            }
            String ocurrence = penToken.value + "" + prevToken.value + "" + curToken.value;
            addMathOps(new InstanceReportMathOps(op, yyline, yycolumn, ocurrence));
        }
    }

    private void updateTokens(Symbol curToken) {
        if (penToken != null && (penToken.sym == sym.NUMBER || penToken.sym == sym.PARENTHESES_END) &&
                prevToken != null && (prevToken.sym == sym.ADDITION || prevToken.sym == sym.SUBSTRACTION || prevToken.sym == sym.MULTIPLICATION || prevToken.sym == sym.DIVISION) &&
                curToken != null && (curToken.sym == sym.NUMBER || curToken.sym == sym.PARENTHESES_START)) {

                handleMathOp((String) prevToken.value);
            }

        if ((curToken != null && curToken.sym == sym.PARENTHESES_START && prevToken != null && prevToken.sym == sym.PARENTHESES_END) ||
            (curToken != null && curToken.sym == sym.NUMBER && prevToken != null && prevToken.sym == sym.PARENTHESES_END) ||
            (curToken != null && curToken.sym == sym.PARENTHESES_START && prevToken != null && prevToken.sym == sym.NUMBER)) {

            handleMathOp(null);
        }

        penToken = prevToken;
        prevToken = curToken;
    }

    private int timesBlue = 0;
    private int timesRojo = 0;
    private int timesAmarillo = 0;
    private int timesVerde = 0;
    private int timesCeleste = 0;
    private int timesNegro = 0;
    private int timesRosado = 0;
    private int timesCafe = 0;
    private int timesNaranja = 0;

    public int getTimesBlue() {
        return timesBlue;
    }

    public int getTimesRojo() {
        return timesRojo;
    }

    public int getTimesAmarillo() {
        return timesAmarillo;
    }

    public int getTimesVerde() {
        return timesVerde;
    }

    public int getTimesCeleste() {
        return timesCeleste;
    }

    public int getTimesNegro() {
        return timesNegro;
    }

    public int getTimesRosado() {
        return timesRosado;
    }

    public int getTimesCafe() {
        return timesCafe;
    }

    public int getTimesNaranja() {
        return timesNaranja;
    }
%}

// Regular definitions
delim = [ \t\n]
ws = {delim}+
letter = [A-Za-z\_]
digit = [0-9]
number = {digit}+(\.{digit}+)?
name = {letter}+({number}*{letter}*)*

%%
<YYINITIAL> {

    // Reserved words
    "graficar" {
        curToken = new Symbol(sym.GRAFICAR, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "animar" {
        curToken = new Symbol(sym.ANIMAR, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "objeto" {
        curToken = new Symbol(sym.OBJETO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "anterior" {
        curToken = new Symbol(sym.ANTERIOR, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "circulo" {
        curToken = new Symbol(sym.CIRCULO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "cuadrado" {
        curToken = new Symbol(sym.CUADRADO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "rectangulo" {
        curToken = new Symbol(sym.RECTANGULO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "linea" {
        curToken = new Symbol(sym.LINEA, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "poligono" {
        curToken = new Symbol(sym.POLIGONO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "azul" {
        curToken = new Symbol(sym.AZUL, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesBlue++;
        return curToken;
    }
    "rojo" {
        curToken = new Symbol(sym.ROJO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesRojo++;
        return curToken;
    }
    "amarillo" {
        curToken = new Symbol(sym.AMARILLO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesAmarillo++;
        return curToken;
    }
    "verde" {
        curToken = new Symbol(sym.VERDE, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesVerde++;
        return curToken;
    }
    "celeste" {
        curToken = new Symbol(sym.CELESTE, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesCeleste++;
        return curToken;
    }
    "negro" {
        curToken = new Symbol(sym.NEGRO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesNegro++;
        return curToken;
    }
    "rosado" {
        curToken = new Symbol(sym.ROSADO, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesRosado++;
        return curToken;
    }
    "cafe" {
        curToken = new Symbol(sym.CAFE, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesCafe++;
        return curToken;
    }
    "naranja" {
        curToken = new Symbol(sym.NARANJA, yyline, yycolumn, yytext());
        updateTokens(curToken);
        timesNaranja++;
        return curToken;
    }
    "curva" {
        curToken = new Symbol(sym.CURVA, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    
    {ws} {/* ignore */}
    {number} {
        curToken = new Symbol(sym.NUMBER, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    {name} {
        curToken = new Symbol(sym.NAME, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "+" {
        curToken = new Symbol(sym.ADDITION, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "-" {
        curToken = new Symbol(sym.SUBSTRACTION, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "*" {
        curToken = new Symbol(sym.MULTIPLICATION, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "/" {
        curToken = new Symbol(sym.DIVISION, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "(" {
        curToken = new Symbol(sym.PARENTHESES_START, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    ")" {
        curToken = new Symbol(sym.PARENTHESES_END, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }
    "," {
        curToken = new Symbol(sym.COMMA, yyline, yycolumn, yytext());
        updateTokens(curToken);
        return curToken;
    }


    [^] {System.out.println("Lexical error: " + yytext() + " in line: " + yyline + " & col " + yycolumn);}
}