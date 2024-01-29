package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiecinueve {

    public void velBici() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("A cuantos km se encuentra la otra ciudad? ");
        String input = reader.readLine();
        double km = Double.parseDouble(input);

        System.out.print("Ingrese la velocidad a la que viaja: ");
        input = reader.readLine();
        double v = Double.parseDouble(input);


        double tiempo = km/v;

        System.out.println("Usted tardara " + tiempo + " horas en llegar");

    }
}
