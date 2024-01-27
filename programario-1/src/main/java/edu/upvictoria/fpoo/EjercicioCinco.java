package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {

    public void terreno() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el valor del terreno en A: ");
        String input = reader.readLine();
        double a = Double.parseDouble(input);

        System.out.print("Ingrese el valor del terreno en B: ");
        input = reader.readLine();
        double b = Double.parseDouble(input);

        double c = a/2;
        double rectangulo = c*b;
        double triangulo = (c*b)/2;

        double area = rectangulo + triangulo;

        System.out.println("El area de su terreno es de " + area);

    }

}
