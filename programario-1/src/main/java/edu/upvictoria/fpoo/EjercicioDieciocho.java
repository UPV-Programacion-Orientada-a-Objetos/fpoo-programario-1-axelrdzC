package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDieciocho {

    public void boleto() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Cuantos kilometros recorrrera el autobus? ");
        String input = reader.readLine();
        double km = Double.parseDouble(input);

        System.out.print("Cuantos es el costo por kilometro? ");
        input = reader.readLine();
        double costo = Double.parseDouble(input);

        double precio = costo*km;

        System.out.println("El boleto tendra un costo de $" + precio + " pesos");


    }

}
