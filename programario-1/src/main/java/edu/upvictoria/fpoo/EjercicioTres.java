package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {

    public void areaRec() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la altura del rectangulo: ");
        String input = reader.readLine();
        float h = Float.parseFloat(input);

        System.out.print("Ingrese la base del rectangulo: ");
        input = reader.readLine();
        float b = Float.parseFloat(input);

        float area = (b*h);

        System.out.println("El area del rectangulo es: " + area);

    }

}
