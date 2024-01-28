package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCatorce {

    public void edad() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el año en que nació el postulado: ");
        String input = reader.readLine();
        double edad = Double.parseDouble(input);

        System.out.print("Ingrese el año en el que se encuentra: ");
        input = reader.readLine();
        double actual = Double.parseDouble(input);

        double eReal = actual - edad;

        System.out.println("El postulado tiene: " + eReal + " años");

    }

}
