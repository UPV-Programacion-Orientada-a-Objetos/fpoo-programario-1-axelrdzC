package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOnce {

    public void alberca() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el precio a pagar x m^3: ");
        String input = reader.readLine();
        double m = Double.parseDouble(input);

        System.out.print("Ingrese la altura de la alberca: ");
        input = reader.readLine();
        double a = Double.parseDouble(input);

        System.out.print("Ingrese el largo de la alberca: ");
        input = reader.readLine();
        double l = Double.parseDouble(input);

        System.out.print("Ingrese el ancho de la alberca: ");
        input = reader.readLine();
        double an = Double.parseDouble(input);

        double volumen = 2*((l*an)+(l*a)+(an*a));

        double pesos = m*volumen;

        System.out.println("Para una alberca de " + volumen + " m^3 se cobraran $" + pesos + " pesos");


    }
}
