package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeinticinco {

    public void cheque() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido, ingrese el numero de dias que saldra el empleado: ");
        String input = reader.readLine();
        double dias = Double.parseDouble(input);
        System.out.println("Ingrese el costo del hotel x dia en pesos: ");
        input = reader.readLine();
        double hotel = Double.parseDouble(input);
        System.out.println("Ingrese el costo x la comida al dia en pesos: ");
        input = reader.readLine();
        double comida = Double.parseDouble(input);

        System.out.println("Generando cheque... ");
        double cheque = ((hotel+comida+100)*dias);
        System.out.println("Cheque generado!, su empleado recibira $" + cheque + " pesos para cubir sus gastos");

    }
}
