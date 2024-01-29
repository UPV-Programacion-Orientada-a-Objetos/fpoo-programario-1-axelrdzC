package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioVeintiuno {

    public void coangua() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el costo por m^3 de agua: ");
        String input = reader.readLine();
        double costo = Double.parseDouble(input);

        System.out.print("Cuantos m^3 se consumieron? ");
        input = reader.readLine();
        double consumo = Double.parseDouble(input);

        double total = costo*consumo;

        System.out.println("El total a cobrar sera de: $" + total + " pesos");


    }

}
