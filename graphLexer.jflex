// Declarations
package org.graph.backend;

import java_cup.runtime.*;

// Translation rules
%%
%class GraphLexer
%unicode
%line
%column
%public
%cup

// Regular definitions
delim = [ \t\n]
ws = {delim}+
letter = [A-Za-z\_]
digit = [0-9]
number = {digit}+(\.{digit}+)?
name = {letter}+

%%
<YYINITIAL> {

    // Reserved words
    "graficar" {return new Symbol(sym.GRAFICAR, yyline+1, yycolumn+1, yytext());}
    "animar" {return new Symbol(sym.ANIMAR, yyline+1, yycolumn+1, yytext());}
    "objeto" {return new Symbol(sym.OBJETO, yyline+1, yycolumn+1, yytext());}
    "anterior" {return new Symbol(sym.ANTERIOR, yyline+1, yycolumn+1, yytext());}
    "circulo" {return new Symbol(sym.CIRCULO, yyline+1, yycolumn+1, yytext());}
    "cuadrado" {return new Symbol(sym.CUADRADO, yyline+1, yycolumn+1, yytext());}
    "rectangulo" {return new Symbol(sym.RECTANGULO, yyline+1, yycolumn+1, yytext());}
    "linea" {return new Symbol(sym.LINEA, yyline+1, yycolumn+1, yytext());}
    "poligono" {return new Symbol(sym.POLIGONO, yyline+1, yycolumn+1, yytext());}
    "azul" {return new Symbol(sym.AZUL, yyline+1, yycolumn+1, yytext());}
    "rojo" {return new Symbol(sym.ROJO, yyline+1, yycolumn+1, yytext());}
    "amarillo" {return new Symbol(sym.AMARILLO, yyline+1, yycolumn+1, yytext());}
    "verde" {return new Symbol(sym.VERDE, yyline+1, yycolumn+1, yytext());}
    "celeste" {return new Symbol(sym.CELESTE, yyline+1, yycolumn+1, yytext());}
    "negro" {return new Symbol(sym.NEGRO, yyline+1, yycolumn+1, yytext());}
    "rosado" {return new Symbol(sym.ROSADO, yyline+1, yycolumn+1, yytext());}
    "cafe" {return new Symbol(sym.CAFE, yyline+1, yycolumn+1, yytext());}
    "naranja" {return new Symbol(sym.NARANJA, yyline+1, yycolumn+1, yytext());}
    "curva" {return new Symbol(sym.CURVA, yyline+1, yycolumn+1, yytext());}
    "linea_a" {return new Symbol(sym.LINEA_A, yyline+1, yycolumn+1, yytext());}
    
    {ws} {/* ignore */}
    {number} {return new Symbol(sym.NUMBER, yyline+1, yycolumn+1, yytext());}
    {name} {return new Symbol(sym.NAME, yyline+1, yycolumn+1, yytext());}
    "+" {return new Symbol(sym.ADDITION, yyline+1, yycolumn+1, yytext());}
    "-" {return new Symbol(sym.SUBSTRACTION, yyline+1, yycolumn+1, yytext());}
    "*" {return new Symbol(sym.MULTIPLICATION, yyline+1, yycolumn+1, yytext());}
    "/" {return new Symbol(sym.DIVISION, yyline+1, yycolumn+1, yytext());}
    "(" {return new Symbol(sym.PARENTHESES_START, yyline+1, yycolumn+1, yytext());}
    ")" {return new Symbol(sym.PARENTHESES_END, yyline+1, yycolumn+1, yytext());}
    "," {return new Symbol(sym.COMMA, yyline+1, yycolumn+1, yytext());}


    [^] {System.out.println("Lexical error: " + yytext() + " in line: " + yyline+1 + " & col " + yycolumn+1);}
}