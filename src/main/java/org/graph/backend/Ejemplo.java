package org.graph.backend;

import java.io.StringReader;

public class Ejemplo {

    public static void main(String[] args) {
        System.out.println("Hello world");

        String entrada = "graficar poligono ( PoligA, (2.3-2)*12  + 2 -1/12, 15, 6, 50 / 2, 12, amarillo)";

        StringReader reader = new StringReader(entrada);
        GraphLexer lexer = new GraphLexer(reader);
        GraphParser parser = new GraphParser(lexer);

        try {
            parser.parse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
